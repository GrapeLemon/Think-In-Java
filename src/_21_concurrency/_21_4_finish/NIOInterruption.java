package _21_concurrency._21_4_finish;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousCloseException;
import java.nio.channels.ClosedByInterruptException;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * @Author wx-li
 * @Date 2019/8/22 15:39
 **/
class NIOBlocked implements Runnable {
    private final SocketChannel sc;

    public NIOBlocked(SocketChannel sc) {
        this.sc = sc;
    }

    @Override
    public void run() {
        System.out.println("Waiting for read() in " + this.hashCode());
        try {
            sc.read(ByteBuffer.allocate(1));
        } catch (ClosedByInterruptException e) {
            System.out.println("ClosedByInterruptException");
        }catch (AsynchronousCloseException e) {
            System.out.println("AsynchronousCloseException");
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Exiting NIOBlocked.run() " + this.hashCode());
    }
}

public class NIOInterruption{
    public static void main(String[] args) throws IOException, InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool();
        ServerSocket server = new ServerSocket(8080);
        InetSocketAddress isa = new InetSocketAddress("localhost",8080);
        SocketChannel sc1 = SocketChannel.open(isa);
        SocketChannel sc2 = SocketChannel.open(isa);
        //我们可以使用shutdownNow()直接清理掉所有的问题
        Future<?> f = exec.submit(new NIOBlocked(sc1));
        exec.execute(new NIOBlocked(sc2));
        exec.shutdown();
        TimeUnit.SECONDS.sleep(1);
        // Produce an interrupt via cancel:
        f.cancel(true);
        TimeUnit.SECONDS.sleep(1);
        //Release the block by closing the channel;
        sc2.close();
    }
}
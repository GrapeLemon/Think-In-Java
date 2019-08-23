package _21_concurrency._21_2_basic;

public class LiftOff implements Runnable{
    protected int countDown = 10;   //Default
    private static int taskCount = 0;
    //标识符id可以用来区分任务的多个实例,它是final的,因为它一旦被初始化之后就不希望被修改了
    private final int id = taskCount++;

    public LiftOff(){}

    public LiftOff(int countDown) {
        this.countDown = countDown;
    }

    public String status() {
        return "#" + id + "(" +
                (countDown > 0 ? countDown : "Liftoff!") + ").";
    }

    @Override
    public void run() {
        while(countDown-- > 0){
            System.out.print(status() + " ");
            //该方法是对线程调度器的一种建议,它在声明：“我已经执行完声明周期中最重要的部分了，此刻正是切换给其他任务执行一段时间的大好时机”
            Thread.yield();
        }
        System.out.println();
    }
}

package _15_generics._03_generics_interface;

/**
 * @author lwx
 * @date 2019/9/1-15:22
 */
public class Fibonacci implements Generator<Integer>{
    private int count = 0;
    @Override
    public Integer next() {
        return fib(count++);
    }

    private int fib(int n) {
        if (n < 2) return 1;
        return fib(n - 2) + fib(n - 1);
    }

    public static void main(String[] args) {
        Fibonacci gen = new Fibonacci();
        for (int i = 0; i < 18; i++) {
            System.out.print(gen.next() + " ");
        }
    }
}

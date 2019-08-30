package _12_exceptions._10_exceptions_in_constructors;

/**
 * @Author wx-li
 * @Date 2019/8/30 13:53
 * Each disposable object must be followed by a try-finally
 * Idiom : 成语;惯用语;方言;风格;特色
 **/

class NeedsCleanup {    // Construction can't fail
    private static long counter = 1;
    private final long id = counter++;
    public void dispose() {
        System.out.println("NeedsCleanup " + id + " disposed");
    }
}

class ConstructionException extends Exception {}

class NeedsCleanup2 extends NeedsCleanup {
    // Construction can fail:
    public NeedsCleanup2() throws ConstructionException{}
}

public class CleanupIdiom {
    public static void main(String[] args) {
        // Section 1:
        NeedsCleanup nc1 = new NeedsCleanup();
        try {
            // ...
        } finally {
            //注意,如果dispose()可以抛出异常,那么你可能需要额外的try语句块
            //基本上,你应该仔细考虑所有的可能性,并确保正确处理每一种情况
            nc1.dispose();
        }

        // Section 2:
        // If construction cannot fail you can group objects:
        NeedsCleanup nc2 = new NeedsCleanup();
        NeedsCleanup nc3 = new NeedsCleanup();
        try {
            //  ...
        } finally {
            nc3.dispose();  // Reverse order of construction
            nc2.dispose();
        }

        // 可以看到下面这部分的异常处理非常棘手,所以我们应该创建不能失败的构造器!
        // 但是如果真的遇到有的话,还是要懂得如何处理
        // Section 3:
        // If construction can fail you must guard each one:
        try {
            NeedsCleanup2 nc4 = new NeedsCleanup2();
            try {
                NeedsCleanup2 nc5 = new NeedsCleanup2();
                try {
                    // ...
                } finally {
                    nc5.dispose();
                }
            } catch (ConstructionException e) { // nc5 constructor
                System.out.println(e);
            } finally {
                nc4.dispose();
            }
        } catch (ConstructionException e) { // nc4 constructor
            System.out.println(e);
        }
    }
}

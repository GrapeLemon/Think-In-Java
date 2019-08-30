package _12_exceptions._10_exceptions_in_constructors;

/**
 * @Author wx-li
 * @Date 2019/8/30 13:39
 * Guaranteeing proper cleanup of a resource
 **/
public class Cleanup {
    public static void main(String[] args) {
        // 这种通用的清理手法在构造器不抛出任何异常时也应该运用,其基本规则是:
        // 在创建需要清理的对象之后,立即进入一个try-finally语句块
        // 说白了,对象又可能没有打开成功,这时候不能调用清理,否则会报错
        // 只有确保真的打开了对象才去执行清理操作,之前对这个的理解太浅了,现在总算能理解其深意了
        try {
            InputFile in = new InputFile("Cleanup.java");
            try {
                String s;
                int i = 1;
                while ((s = in.getLine()) != null) {
                    // Perform line-by-line processing here...
                }
            } catch (Exception e) {
                System.out.println("Caught Exception in main");
                e.printStackTrace(System.out);
            } finally {
                in.dispose();   // 这样写的话finally子句在构造失败时是不会执行的,而在构造成功时将总是执行.
            }
        } catch (Exception e) {
            System.out.println("InputFile construction failed");
        }
    }
}

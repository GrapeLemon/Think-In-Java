package _02_object;

/**
 * @Author wx-li
 * @Date 2019/8/23 9:17
 **/
public class ShowProperties {
    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(
                System.getProperty("java.library.path"));

    }
}

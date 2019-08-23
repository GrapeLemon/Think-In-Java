package _04_performing._7_label;

/**
 * @Author wx-li
 * @Date 2019/8/23 17:25
 * While loops with "labeled break" and "labeled continue"
 **/
public class LabeledWhile {
    public static void main(String[] args) {
        int i = 0;
        outer:
        while (true) {
            while (true) {
                i++;
                System.out.println("i = " + i);
                if (i == 1) {
                    System.out.println("continue");
                    continue;
                }
                if (i == 3) {
                    System.out.println("continue outer");
                    continue outer;
                }
                if (i == 5) {
                    System.out.println("break");
                    break;
                }
                if (i == 7) {
                    System.out.println("break outer");
                    break outer;
                }
            }
        }
    }
}

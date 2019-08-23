package _04_performing._7_label;

/**
 * @Author wx-li
 * @Date 2019/8/23 17:14
 * For loops with "labeled break" and "labeled continue."
 **/
public class LabeledFor {
    public static void main(String[] args) {
        int i = 0;
        outer:      //Can't have statements here
        for(;;){    //infinite loop
            inner:
            for (; i < 10; i++) {
                System.out.println("i = " + i);
                if(i == 2){
                    System.out.println("continue");
                    continue ;
                }
                if(i == 3){
                    System.out.println("break");
                    i++;    //Otherwise i never gets incremented.
                    continue outer;
                }
                if(i == 8){
                    System.out.println("break outer");
                    break outer;
                }
                for (int k = 0; k < 5; k++) {
                    if(k == 3){
                        System.out.println("continue inner");
                        continue inner;
                    }
                }
            }
        }
    }
}

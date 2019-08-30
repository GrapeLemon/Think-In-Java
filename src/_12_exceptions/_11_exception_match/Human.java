package _12_exceptions._11_exception_match;

/**
 * @Author wx-li
 * @Date 2019/8/30 14:13
 * Catching exception hierarchies(捕获异常的层次).
 **/

class Annoyance extends Exception{}
class Sneeze extends Annoyance{}

public class Human {
    public static void main(String[] args) {
        // Catch the exact(精确的,切确的) type:
        try {
            throw new Sneeze();
        } catch (Sneeze e) {
            System.out.println("Caught Sneeze");
        } catch (Annoyance a) {
            System.out.println("Caught Annoyance");
        }
        // Catch the base type:
        try {
            throw new Sneeze();
        } catch (Annoyance a) {
            System.out.println("Caught Annoyance");
        }
        //can't compile
        /*try {
            throw new Sneeze();
        } catch (Annoyance a) {
            // ...
        } catch (Sneeze s) {
            // ...
        }*/

    }
}

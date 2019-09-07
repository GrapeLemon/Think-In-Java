package _17_go_deep_in_container._09_hash_and_hashcode._04_choose_different_impl_of_interfaces._03_danger_of_micro_standard_test;

/**
 * @author wx-li
 * @date 2019/9/7-16:45
 * Does Math.random() produce 0.0 and 1.0?
 **/
public class RandomBounds {
    static void usage() {
        System.out.println("Usage: ");
        System.out.println("\t RandomBounds lower");
        System.out.println("\t RandomBounds upper");
        System.exit(1);
    }

    public static void main(String[] args) {
        if(args.length != 1) usage();
        if (args[0].equals("lower")) {
            while (Math.random() != 0.0)
                ; // Keep trying
            System.out.println("Produced 0.0!");
        } else if (args[0].equals("upper")) {
            while (Math.random() != 1.0)
                ; // Keep trying
            System.out.println("Produced 1.0!");
        }else
            usage();
    }

    private static class Starter {
        static final String[] arg = {"lower"};
        public static void main(String[] args) {
            RandomBounds.main(arg);
        }
    }

}

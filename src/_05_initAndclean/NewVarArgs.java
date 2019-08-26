package _05_initAndclean;

/**
 * @Author wx-li
 * @Date 2019/8/26 9:58
 * using array syntax to create variable argument lists.
 **/
public class NewVarArgs {
    static void printArray(Object... args){
        for (Object obj : args) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //Only array
        printArray(new Integer[]{1,2,3,4,5});
        //array & obj 会发现arry也被当成了一个单一的obj
        //这样写的话会输出三个元素,第一个输出的是名称@地址
        printArray((Object[]) new Integer[]{1,2,3,4,5},6,7);

    }
}

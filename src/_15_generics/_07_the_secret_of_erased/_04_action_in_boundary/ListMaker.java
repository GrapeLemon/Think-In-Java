package _15_generics._07_the_secret_of_erased._04_action_in_boundary;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wx-li
 * @Date 2019/9/2 17:56
 **/
public class ListMaker<T> {
    List<T> create(){ return new ArrayList<>(); }

    public static void main(String[] args) {
        ListMaker<String> stringMaker = new ListMaker<>();
        List<String> stringList = stringMaker.create();
        // 这个错报的很有意思
        // required : Integer
        // Found: String
        // 说明静态类型检查起了作用
        // List<Integer> integerList = stringMaker.create();
    }
}

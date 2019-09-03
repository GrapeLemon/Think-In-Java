package _15_generics._11_problems_of_using_generics._01_cannot_use_primitive_type;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wx-li
 * @Date 2019/9/3 15:28
 **/
public class ListOfInt {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < 5; i++)
            li.add(i);
        for (int i : li)
            System.out.print(i + " ");
    }
}

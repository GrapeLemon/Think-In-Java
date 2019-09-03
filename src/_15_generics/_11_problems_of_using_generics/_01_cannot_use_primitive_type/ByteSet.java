package _15_generics._11_problems_of_using_generics._01_cannot_use_primitive_type;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author wx-li
 * @Date 2019/9/3 15:31
 **/
public class ByteSet {
    Byte[] possibles = {1, 2, 3, 4, 5, 6,7, 8, 9};
    Set<Byte> mySet = 
        new HashSet<Byte>(Arrays.asList(possibles));
    // But you can't do this:
    // Set<Byte> mySet2 = new HashSet<>(
    //     Arrays.<Byte>asList(1,2,3,4,5,6,7,8,9););
}

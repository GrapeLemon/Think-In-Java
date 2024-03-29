package _15_generics._07_the_secret_of_erased;

import java.util.*;

/**
 * @Author wx-li
 * @Date 2019/9/2 16:51
 **/
class Frob{}
class Fnorkle{}
class Quark<Q>{}
class Particle<POSITION,MOMENTUM>{}

public class LostInformation {
    public static void main(String[] args) {
        List<Frob> list = new ArrayList<>();
        Map<Frob, Fnorkle> map = new HashMap<>();
        Quark<Fnorkle> quark = new Quark<>();
        Particle<Long, Double> p = new Particle<>();
        System.out.println(Arrays.toString(
            list.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(
            map.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(
            quark.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(
            p.getClass().getTypeParameters()));
    }
}

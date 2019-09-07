package _17_go_deep_in_container._09_hash_and_hashcode._03_overwrite_hashCode_method;

import _14_type_info.pets.Pet;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author wx-li
 * @date 2019/9/7-10:03
 **/
public class IndividualTest {
    public static void main(String[] args) {
        Set<Individual> pets = new TreeSet<>();
        for (List<? extends Pet> lp :MapOfList.petPeople.values()) {
            for (Pet p : lp) {
                pets.add(p);
            }
            System.out.println(pets);
        }
    }
}

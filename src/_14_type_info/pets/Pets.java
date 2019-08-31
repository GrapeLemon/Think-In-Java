package _14_type_info.pets;

import java.util.ArrayList;

/**
 * @Author wx-li
 * @Date 2019/8/31 13:39
 * Facade to produce a default PetCreator.
 * 等等,那那个什么 Arrays 怕不是也是所谓的门面模式吧..
 **/
public class Pets {
    //如果想换门面的话在把实现类换掉就好了
    public static final PetCreator creator = new LiteralPetCreator();
    public static Pet randomPet() {
        return creator.randomPet();
    }

    public static Pet[] createArray(int size) {
        return creator.createArray(size);
    }
    public static ArrayList<Pet> arrayList(int size) {
        return creator.arrayList(size);
    }
}

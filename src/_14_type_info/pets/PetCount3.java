package _14_type_info.pets;

import java.util.LinkedHashMap;

/**
 * @Author wx-li
 * @Date 2019/8/31 13:48
 * using isInstance()
 * 缺少一个工具类 MapData 不会弄了
 **/
public class PetCount3 {
    static class PetCounter
    extends LinkedHashMap<Class<? extends Pet>, Integer> {
        public PetCounter() {
        }
    }
}

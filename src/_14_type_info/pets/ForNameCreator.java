package _14_type_info.pets;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wx-li
 * @Date 2019/8/31 13:04
 **/
public class ForNameCreator extends PetCreator{
    private static List<Class<? extends Pet>> types = new ArrayList<>();
    //Types that you want to be randomly created:
    private static String[] typeNames = {
      "_14_type_info.pets.Mutt",      
      "_14_type_info.pets.Pug",      
      "_14_type_info.pets.EgyptianMau",      
      "_14_type_info.pets.Manx",      
      "_14_type_info.pets.Cymric",      
      "_14_type_info.pets.Rat",      
      "_14_type_info.pets.Mouse",      
      "_14_type_info.pets.Hamster",      
    };
    @SuppressWarnings("unchecked")
    private static void loader() {
        for (String name : typeNames) {
            try {
                types.add(
                        (Class<? extends Pet>)Class.forName(name));
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }
    static {
        loader();
    }

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }
}

package _14_type_info.pets;

/**
 * @Author wx-li
 * @Date 2019/8/31 11:23
 **/
public abstract class Individual {
    private static Long counter = 1L;
    private static final Long id = counter++;
    private String name;
    public Individual(String name) {
        this.name = name;
    }
    public Individual(){}
    public Long id(){
        return id;
    }
}

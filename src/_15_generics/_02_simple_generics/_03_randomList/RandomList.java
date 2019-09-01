package _15_generics._02_simple_generics._03_randomList;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author lwx
 * @date 2019/9/1-11:46
 */
public class RandomList<T> {
    private ArrayList<T> storage = new ArrayList<>();
    private Random rand = new Random(47);
    public void add(T item){ storage.add(item); }
    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<>();
        for(String s : ("The quick brown for jumped over "+
                "the lazy brown dog").split(" "))
            rs.add(s);
        for (int i = 0; i < 11; i++) {
            System.out.print(rs.select() + " ");
        }
    }
}

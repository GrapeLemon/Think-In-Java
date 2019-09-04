package _17_go_deep_in_container._02_fill_cotainers._02_generate_map;

/**
 * @Author wx-li
 * @Date 2019/9/4 13:32
 **/
public class Pair<K,V> {
    public final K key;
    public final V value;
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
}

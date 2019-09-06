package _17_go_deep_in_container._09_hash_and_hashcode._01_understanding_hashcode_method;

import _00_utils.Countries;

import java.util.*;

/**
 * @author wx-li
 * @date 2019/9/5-18:43
 * A Map implemented with ArrayLists
 **/
public class SlowMap<K,V> extends AbstractMap<K,V> {
    private List<K> keys = new ArrayList<>();
    private List<V> values = new ArrayList<>();
    public V put(K key, V value) {
        V oldValue = get(key); // The old value or null
        if (!keys.contains(key)) {
            keys.add(key);
            values.add(value);
        } else {
            values.set(keys.indexOf(key), value);
        }
        return oldValue;
    }
    public V get(Object key) {  // key is type Object, not K
        if (!keys.contains(key)) {
            return null;
        }
        return values.get(keys.indexOf(key));
    }
    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Map.Entry<K,V>> set = new HashSet<>();
        Iterator<K> ki = keys.iterator();
        Iterator<V> vi = values.iterator();
        while (ki.hasNext()) {
            set.add(new MapEntry<>(ki.next(), vi.next()));
        }
        return set;
    }

    public static void main(String[] args) {
        SlowMap<String, String> m = new SlowMap<>();
        m.putAll(Countries.capitals(15));
        System.out.println(m);
        System.out.println(m.get("BULGARIA"));
        System.out.println(m.entrySet());
    }
}

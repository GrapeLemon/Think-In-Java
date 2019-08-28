package _10_innerclass._02_connectOuter;

/**
 * @Author wx-li
 * @Date 2019/8/28 8:51
 * Holds a sequence of Objects.
 **/

interface Selector {
    boolean end();
    Object current();
    void next();
}
//外部类用于构造
public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }
    public void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }
    //内部类用于访问
    private class SequenceSelector implements Selector {
        private int i = 0;

        public boolean end() {
            return i == items.length;
        }

        public Object current() {
            return items[i];
        }

        public void next() {
            if (i < items.length) i++;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}


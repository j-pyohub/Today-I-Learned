import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class HashMapChaining {
    private static class Entry {
        String key;
        int value;
        Entry(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    private List<Entry>[] table;
    private int size;

    public HashMapChaining(int size) {
        this.size = size;
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hash(String key) {
        return Math.abs(key.hashCode()) % size;
    }

    public void put(String key, int value) {
        int index = hash(key);
        for (Entry e : table[index]) {
            if (e.key.equals(key)) {
                e.value = value;
                return;
            }
        }
        table[index].add(new Entry(key, value));
    }

    public Integer get(String key) {
        int index = hash(key);
        for (Entry e : table[index]) {
            if (e.key.equals(key)) {
                return e.value;
            }
        }
        return null;
    }

    public void remove(String key) {
        int index = hash(key);
        Iterator<Entry> it = table[index].iterator();
        while (it.hasNext()) {
            if (it.next().key.equals(key)) {
                it.remove();
                return;
            }
        }
    }

    public static void main(String[] args) {
        HashMapChaining hashMapChaining = new HashMapChaining(5);

        hashMapChaining.put("apple", 10);
        hashMapChaining.put("banana", 20);
        hashMapChaining.put("apple", 30);
        System.out.println(hashMapChaining.get("apple"));
        hashMapChaining.remove("banana");
        System.out.println(hashMapChaining.get("banana"));
    }
}

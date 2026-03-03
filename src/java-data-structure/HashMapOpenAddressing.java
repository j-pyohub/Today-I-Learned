public class HashMapOpenAddressing {
    private static class Entry {
        String key;
        int value;

        Entry(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private Entry[] table;
    private int size;
    private final Entry DELETED = new Entry("<deleted>", 0);

    public HashMapOpenAddressing(int size) {
        this.size = size;
        table = new Entry[size];
    }

    private int hash(String key) {
        return Math.abs(key.hashCode()) % size;
    }

    public void put(String key, int value) {
        int index = hash(key);
        for (int i = 0; i < size; i++) {
            int idx = (index + i) % size;
            Entry entry = table[idx];
            if (entry == null || entry == DELETED) {
                table[idx] = new Entry((key), value);
                return;
            }
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
    }

    public Integer get(String key) {
        int index = hash(key);
        for (int i = 0; i < size; i++) {
            int idx = (index + i) % size;
            Entry entry = table[idx];
            if(entry==null) return null;
            if (entry != DELETED && entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    public void remove(String key) {
        int index = hash(key);
        for (int i = 0; i < size; i++) {
            int idx = (index + i) % size;
            Entry entry = table[idx];
            if(entry==null) return;
            if (entry != DELETED && entry.key.equals(key)) {
                table[idx] = DELETED;
                return;
            }
        }
    }

    public static void main(String[] args) {
        HashMapOpenAddressing hashMapOpenAddressing = new HashMapOpenAddressing(8);

        hashMapOpenAddressing.put("apple", 10);
        hashMapOpenAddressing.put("banana", 20);
        hashMapOpenAddressing.put("apple", 30);
        System.out.println(hashMapOpenAddressing.get("apple"));

        hashMapOpenAddressing.remove("banana");
        System.out.println(hashMapOpenAddressing.get("banana"));
    }
}

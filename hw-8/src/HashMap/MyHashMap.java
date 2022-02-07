package HashMap;

public class MyHashMap<K, V> {
    public static final int defoltSize = 16;
    private Node<K, V>[] buckets;
    private int size;

    public MyHashMap(int size) {
        buckets = new Node[size];
    }

    public MyHashMap() {
        this(defoltSize);
    }

    public void put(K key, V value) {
        Node<K, V> node = new Node<>(key, value, null);
        int bucket = getHash(key) % buckets.length;
        Node<K, V> check = buckets[bucket];
        if (check == null) {
            buckets[bucket] = node;
            size++;
        } else {
            while (check.next != null) {
                if (check.key.equals(key)) {
                    check.value = value;
                    return;
                }
                check = check.next;
                size++;
            }

            if (check.key.equals(key)) {
                check.value = value;
            } else {
                check.next = node;
                size++;
            }
        }
    }

    public V get(K key) {
        if (key == null) {
            throw new IllegalArgumentException("Null Key!");
        }
        Node<K, V> check = buckets[key.hashCode() % buckets.length];
        while (check != null) {
            if (check.key.equals(key)) {
                return check.value;
            }
            check = check.next;
        }
        return null;
    }

    public int size() {
        return size;
    }

    public void clear() {
        Node<K, V>[] node = buckets;
        for (int i = 0; i < node.length; i++) {
            node[i] = null;
        }
        size = 0;
    }

    public boolean remove(K key) {
        int index = getHash(key) % buckets.length;
        if (buckets[index] == null){
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (buckets[i].getKey().equals(key)) {
                buckets[i] = null;
                size--;
                for (int j = i; i < size; i++) {
                    buckets[i] = buckets[i + 1];
                }
            }
        }
        return true;
    }


    private int getHash(K key) {
        return key.hashCode();
    }

}

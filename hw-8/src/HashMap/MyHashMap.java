package HashMap;

import HashMap.Node;

public class MyHashMap<K, V> {
    private static final int defoltSize = 16;
    private Node<K, V>[] buckets;
    private int size;

    public MyHashMap() {
        Node<K, V>[] node = (Node<K, V>[]) new Node[defoltSize];
        buckets = node;
    }


    public void put(K key, V value) {
        Node<K, V> node = new Node<>(key, value, null);
        int bucket = key.hashCode() % buckets.length;
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


    public void remove(K key) {
        int index = key.hashCode() % buckets.length;
        Node<K, V> node = buckets[index];
        Node<K, V> previous = null;

        while (true) {
            if (previous == null) {
                buckets[index] = null;
            } else {
                previous.next = node.next;
                node.next = null;
            }
            size--;

            break;
        }

        previous = node;
        node = node.next;
    }


    public void clear() {
        Node<K, V>[] node = buckets;
        for (int i = 0; i < node.length; i++) {
            node[i] = null;
        }
        size = 0;
    }


    public int size() {
        return size;
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


}
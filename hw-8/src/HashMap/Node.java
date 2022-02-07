package HashMap;

import java.util.Objects;

public class Node<K,V> {
    final K key;
    V value;
    Node<K, V> next;

    public Node(K key, V value, Node<K, V> next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public int getHash(){
        return key.hashCode();
    }

    @Override
    public String toString() {
        return "key=" + key +
                ", value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node<K, V> node = (Node<K, V>) o;
        return Objects.equals(key, node.key) && Objects.equals(value, node.value) && Objects.equals(next, node.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value, next);
    }
}

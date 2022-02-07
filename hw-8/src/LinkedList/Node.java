package LinkedList;

public class Node<T> {
    T value;
    Node<T> prev;
    Node<T> next;

    public Node() {
        this(null);
    }

    public Node(T value) {
        this.value = value;
    }


    public T getValue() {
        return value;
    }

    public void setValue(T item) {
        this.value = value;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}

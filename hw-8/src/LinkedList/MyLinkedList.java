package LinkedList;

import java.util.StringJoiner;

public class MyLinkedList<T> {
    private Node<T> head;
    private Node<T> last;
    private int size;

    public void add(T value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = last = newNode;
        } else {
            last.next = newNode;
            newNode.prev = last;
            last = newNode;
        }
        size++;
    }

    public void clear() {
        head.next = head.prev = head;
        size = 0;
    }

    public int size() {
        return size;
    }


    public T get(int index) {
        if (head == null) {
            throw new NullPointerException("List is empty");
        }
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is " + index + ", size is " + size);
        }
        Node<T> node = head;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return (T) node.getValue() ;
    }

    public void remove(int index){
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Index is " + index + ", size is " + size);
        }
        int count = 0;
        Node<T> node = head;
        while (count != index) {
            count++;
            node = node.getNext();
        }
        node.prev.next = node.next;
        node.next.prev = node.prev;
        size--;
    }

    public String toString(){
        StringJoiner stringjoiner = new StringJoiner(", ");
        Node<T> current = head;
        while(current != null){
            stringjoiner.add(current.getValue().toString());
            current = current.getNext();

        }

        return "["+stringjoiner.toString().trim()+"]";
    }
}

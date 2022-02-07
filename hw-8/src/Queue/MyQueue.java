package Queue;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyQueue<T> {
    private Object[] array;
    private int front; // первый
    private int rear; // последний
    private int defaultSize = 10;
    private int size;
    private int index = 0;
    private static final Object[] emptyArray = {};

    public MyQueue() {
        array = new Object[defaultSize];
    }

    public MyQueue(int size) {
        array = new Object[size];
        this.size = size;
        front = rear = 0;
    }

    public void add(T value) {
        if (rear == array.length) {
            throw new IndexOutOfBoundsException("Queue is full");
        }
        array[index++] = value;
        size++;
        rear++;
    }

    public int size() {
        return size;
    }


    public void clear() {
        array = emptyArray;
        size = 0;
    }
    public T remove(int i) {
        if (i < 0 || i > size) {
            throw new NoSuchElementException();
        }
        T valueOfPoll = (T) array[front];
        Object[] newArray = new Object[index - 1];
        System.arraycopy(array, 0, newArray, 0, i);
        System.arraycopy(array, i + 1, newArray, i, array.length - i - 1);
        array = newArray;
        size--;
        return (T) valueOfPoll;
    }

    public T poll() {
        if (size == 0){
            return null;
        }
        T valueOfPoll = (T) array[front];
        int newSize = size -1;
        Object[] newArray = new Object[newSize];
        System.arraycopy(array,1,newArray,0,newSize);
        array = newArray;
        size--;
        return (T) valueOfPoll;
    }

    public T peek() {
        if (size == 0){
            return null;
        }
        if (front == rear) {
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        return (T) array[front];
    }



    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}

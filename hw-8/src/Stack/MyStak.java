package Stack;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyStak<T> {
    private Object[] array;
    private int top; // последний
    private static int size;
    private int defaultSize = 16;

    public MyStak() {
        array = new Object[defaultSize];
        size = defaultSize;
        top = -1;
    }

    public MyStak(int size) {
        array = new Object[size];
        this.size = size;
        top = -1;
    }

    public int size() {
        return top + 1;
    }

    public void push(T value) {
        if (top == size - 1) {
            throw new IndexOutOfBoundsException();
        }
        array[++top] = value;
    }

    public T remove(int i){
        if (i < 0 || i > size){
            throw new NoSuchElementException();
        }
        T toRemove = (T) array[i];
        Object[] newArray = new Object[size];
        System.arraycopy(array,0,newArray,0,i);
        System.arraycopy(array,i+1,newArray,i,size()-i-1);
        array = newArray;
        top--;
        return toRemove;
    }

    public void clear(){
        array = new Object[size];
        top = -1;
    }

    public T peek(){
        if (isEmpty()){
            return null;
        }
        return (T) array[top];
    }

    public T pop(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        Object[] newArray = new Object[size];
        System.arraycopy(array,0,newArray,0,size()-1);
        array = newArray;
        return (T) array[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }



    //    // Utility function to add an element `x` to the stack
//    public void push(int x)
//    {
//        if (isFull())
//        {
//            System.out.println("Overflow\nProgram Terminated\n");
//            System.exit(-1);
//        }
//
//        System.out.println("Inserting " + x);
//
//
    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}

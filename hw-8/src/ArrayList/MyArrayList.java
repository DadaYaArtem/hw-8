package ArrayList;


import java.util.Arrays;

public class MyArrayList<T>{
    private Object array[];
    private static final int defoltSize = 10;
    private static final Object[] emptyArray = {};
    private int index  = 0;

    public int size() {
        return index;
    }

    public MyArrayList(){
        array = new Object[defoltSize];
    }


    public void add(T value){
        resizeIfNeeded();
        array[index] = value;
        index++;
    }

    private void resizeIfNeeded(){
        if (index == array.length){
            int newSize = array.length * 2;
            Object[] newArray = new Object[newSize];
            System.arraycopy(array,0,newArray,0,array.length);
            array = newArray;
        }
    }

    public T get(int i){
        if (i < 0 && i > index) {
            throw new IllegalArgumentException("Illegal index");
        }else {
            return (T)array[i];
        }
    }

    public void remove(int i){
        if (i < 0 && i > index) {
            throw new IllegalArgumentException("Illegal index");
        }else {
            Object[] newArray = new Object[index - 1];
            System.arraycopy(array,0,newArray,0,i);
            System.arraycopy(array,i+1,newArray,i,array.length - i - 1);
            array = newArray;
        }
    }

    public boolean isEmpty(){
        if (array.length > 0){
            return false;
        }else {
            return true;
        }
    }

    public boolean contains(T value){
        for (int i = 0 ; i < array.length; i++){
            if (array[i].equals(value)){
                return true;
            }
        }
        return false;
    }

    public void clear(){
        array = emptyArray;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}

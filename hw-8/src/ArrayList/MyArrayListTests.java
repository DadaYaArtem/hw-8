package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListTests {
    public static void main(String[] args) {
        List b = new ArrayList();
        MyArrayList<Integer> list = new MyArrayList();
        list.add(5);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        System.out.println(list.size());
        list.add(6);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }
}

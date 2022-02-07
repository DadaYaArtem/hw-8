package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListTests {
    public static void main(String[] args) {

        MyArrayList<Integer> list = new MyArrayList();
        List a = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(4));
        list.remove(5);
        System.out.println(list.isEmpty());
        System.out.println(list.contains(6));
        System.out.println(list);
        list.clear();
    }
}

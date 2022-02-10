package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyStackTests {
    public static void main(String[] args) {
        Deque queue = new ArrayDeque();
        MyStak stak = new MyStak();
        for (int i = 0 ; i < 10; i++){
            stak.push(i);
        }
        System.out.println(stak);
        System.out.println(stak.size());
        System.out.println(stak.remove(5));
        System.out.println(stak);
        System.out.println(stak.size() + " size");
        System.out.println(stak.peek() + " peek");
        System.out.println(stak.pop() + " pop");
        System.out.println(stak);
    }
}

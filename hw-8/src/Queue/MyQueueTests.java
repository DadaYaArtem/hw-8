package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class MyQueueTests {
    public static void main(String[] args) {
        Queue deque = new ArrayDeque();
        MyQueue queue = new MyQueue();
        for (int i = 0; i < 10; i++) {
            queue.add(i);
        }
        System.out.println(queue);
        System.out.println(queue.size());
        queue.remove(5);
        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}

package LinkedList;


public class MyLinkedListTests {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        list.remove(1);
        System.out.println(list.size());
    }
}

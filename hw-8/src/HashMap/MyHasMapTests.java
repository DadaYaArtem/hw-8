package HashMap;


public class MyHasMapTests {
    public static void main(String[] args) {
        MyHashMap<Integer,String> map = new MyHashMap<Integer,String>();
        map.put(1,"odin");
        map.put(2,"dva");
        map.put(3,"tri");
        map.put(4,"chetire");

        System.out.println(map.get(2));
        map.remove(1);
        System.out.println(map.get(1));
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(4));
        map.remove(4);
        System.out.println(map.get(4));
    }
}


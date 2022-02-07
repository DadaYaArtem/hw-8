package HashMap;

import java.util.HashMap;
import java.util.Map;

public class MyHasMapTests {
    public static void main(String[] args) {
        Map a = new HashMap();
        MyHashMap<Integer,String> map = new MyHashMap<Integer,String>();
        map.put(1,"Artem");
        map.put(2,"Atem");
        System.out.println(map.size());
        System.out.println(map.get(2));
        map.remove(2);

    }
}

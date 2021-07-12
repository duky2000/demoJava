package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class DemoMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new  HashMap<>();
        map.put(1,"a");
        map.put(4,"b");
        map.put(3,"c");
        map.put(2,"d");
        System.out.println(map);
        Map<Integer,String> map1 = new TreeMap<>(map);
        System.out.println(map1);
        Map<Integer,String> map2 = new LinkedHashMap<>(3,2.0f,true);
        map2.put(5,"e");
        map2.put(6,"f");
        map2.put(7,"g");
        map2.put(8,"h");
        System.out.println(map2.get("aaaâ"));
    }
}

import java.util.*;

import dsa.maxcons;
public class Hashmapx {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("India", 20000);
        map.put("China", 5000);
        System.out.println(map.get("China"));
        System.out.println(map.containsKey("India"));
        System.out.println(map.containsKey("Indo"));
    }

    
}

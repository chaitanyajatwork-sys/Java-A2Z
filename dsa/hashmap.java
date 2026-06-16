package dsa;
import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("China", 150);
        map.put("India", 120);
        map.put("USA", 20);
        
        System.out.println(map);
        System.out.println(map.get("China"));
        if(map.containsKey("India")){
            System.out.println("key exists");
        }else
            System.out.println("doesnot exists");
            
         //ITERATION IN HASHMAP
         
         //BOTH {KEY:VALUE} PAIR
         for(Map.Entry<String,Integer>e:map.entrySet()){
            System.out.println(e);
         }
         System.out.println();

         //ONLYKEYS ITERATION
         Set<String> keys=map.keySet();
         for(String key:keys){
            System.out.println(key);

         }
    }
    
}

package dsa;
import java.util.HashMap;
class appear{
    public int hash(int[]nums){
         HashMap<Integer,Integer> map= new HashMap<>();

         for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else
                map.put(nums[i], 1);
         }
         for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==1){
                return nums[i];
            }
         }
         return -1;
    }
}
public class appearoancehash {
    public static void main(String[] args) {
        appear ap=new appear();
        int []a={1,2,3,4,4,4,1,2};
        System.out.println(ap.hash(a));
    }
    
}

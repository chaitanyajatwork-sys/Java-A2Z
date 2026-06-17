package dsa;
import java.util.Arrays;

class sols{
    public int[] shift(int nums[]){
        if(nums.length==0||nums.length==1)
            return nums;

        int temp=nums[0];

        for(int i=1;i<nums.length;i++){
            nums[i-1]=nums[i];
            //
        }
        nums[nums.length-1]=temp;
        return nums;
    }
}

public class leftshiftbyone {
    public static void main(String[] args) {
        sols s=new sols();
        int[] a={};
        System.out.println(Arrays.toString(s.shift(a)));


    }
    
}

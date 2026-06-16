package dsa;
import java.util.Arrays;

class SolutionZero {
    public void moveZeroes(int[] nums) {
        int left = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i]!=0){
                int num = nums[left];
                nums[left] = nums[i];
                nums[i] = num;
                left++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }   
}
public class zeroatlst {
    public static void main(String[] args) {
        SolutionZero z=new SolutionZero();
        int a[]={0,1,0,4,2};

      z.moveZeroes(a);

    }
    
}

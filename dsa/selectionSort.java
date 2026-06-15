package dsa;
import java.util.*;
import java.util.Arrays;

class Selection{
    public int[] Solution(int[]nums){
        int temp=0;
        
        for(int i=0;i<nums.length-1;i++){
            int si=i;
        for(int j=i+1;j<nums.length;j++){
            if(nums[j]<nums[si]){
                si=j;
            }
        }
        temp=nums[i];
        nums[i]=nums[si];
        nums[si]=temp;
    }
    return nums;
}
}
public class selectionSort {
    public static void main(String[] args) {
        Selection s=new Selection();
        int a[]={5,8,6,9,4,2,1};
       System.out.println(Arrays.toString(s.Solution(a)));
    }
}

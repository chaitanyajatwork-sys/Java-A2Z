package dsa;
import java.util.*;
import java.util.Arrays;
class Bubble{
    public String Solution(int[]nums){
        int temp=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;

                }
            }
        }
        return Arrays.toString(nums);
}
}

public class bubbleSort {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Bubble b=new Bubble();
        System.out.println("Enter array length");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(b.Solution(arr));
        
    }
    
}

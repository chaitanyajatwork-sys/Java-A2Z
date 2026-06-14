import java.util.Scanner;
import java.util.Arrays;
class Solution {
    public int []twoSum(int[] nums, int target) {
        // int indices[];
        int i;
        int[]a={};
        for(i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                int []indices={i,j};
                return indices;
                }
           }
        }   
        return null;     
    }
}
public class leetcode1{
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    Solution s= new Solution();
    int n;
    int t;
    System.out.println("Enter target");
    t=in.nextInt();
    System.out.println("Enter array length");
    n=in.nextInt();
     int a[]= new int[n];
     System.out.println("enter array elements");
    for(int i=0;i<n;i++){
        a[i]=in.nextInt();
    }
   System.out.println(Arrays.toString(s.twoSum(a,t)));
    }
}

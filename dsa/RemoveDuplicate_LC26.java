package dsa;
import java.util.Arrays;

class Solution{
    public int[] removeDuplicate(int[]nums){
        int[]temp=new int[nums.length];
        temp[0]=nums[0];
        int j=1;

        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                temp[j]=nums[i];
                j++;
            }
        }
        return Arrays.copyOf(temp, j);


    }
}

public class RemoveDuplicate_LC26 {
    public static void main(String[] args) {
        Solution r=new Solution();
        int arr[]={4,4,5,5,2,2,4,5,6,2};
        System.out.println("original array"+Arrays.toString(arr));
        System.out.println(Arrays.toString(r.removeDuplicate(arr)));
        
    }
   
    
    
}




//OR

// public int removeDuplicates(int[] nums) {

//     int j = 1;

//     for(int i = 1; i < nums.length; i++){
//         if(nums[i] != nums[i-1]){
//             nums[j] = nums[i];
//             j++;
//         }
//     }

//     return j;
// }  
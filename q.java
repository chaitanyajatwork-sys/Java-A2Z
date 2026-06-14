class Solution {
    public int largestElement(int[] nums) {
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max)
                max=nums[i];
        }
        return max;
    }
}
public class q {
    public static void main(String[] args) {
        Solution s=new Solution();
        int []n={3,3,6,8};
        System.out.println(s.largestElement(n));
    }   
}

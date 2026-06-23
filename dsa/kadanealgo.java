package dsa;

class KadaneSol{
    public int maxSubArray(int[] nums) {
        int Maxsum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=0;
            for(int j=i;j<nums.length;j++){
                sum=sum+nums[j];
            if(sum>Maxsum){
                Maxsum=sum;
            }
            }
        }
        return Maxsum;
    }
}


 public class kadanealgo{
    public static void main(String[]args){
        KadaneSol s=new KadaneSol();
        int[]a={2,3,5,-2,7,-4};
        System.out.println(s.maxSubArray(a));
        
    
        
    }
}
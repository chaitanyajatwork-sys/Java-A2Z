package dsa;
class kadan{
    public int Kadsol(int[]nums){
        int sum=0;
        int Maxsum=Integer.MIN_VALUE;
;
        for(int i=0;i<nums.length;i++){
            sum=0;
            for(int j=i;j<nums.length;j++){
                sum=sum+nums[j];
                
            }//System.out.println(sum);
            if(Maxsum<sum){
                Maxsum=sum;
                int maxindex=i;
                return i;   
        }
        }
        return -1;
}
}
public class kadane {
    public static void main(String[] args) {
        kadan k=new kadan();
        int[]a={2, 3, 5, -2, 7, -4};
        System.out.println(k.Kadsol(a));
    }
}

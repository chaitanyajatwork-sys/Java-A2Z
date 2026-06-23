package dsa;
import java.util.Arrays;
class rearrange{
    public int[] reSol(int[]nums){
        int []neg=new int[nums.length/2];
        int []pos=new int[nums.length/2];
        int res[]=new int[nums.length];
         int j=0;
            int k=0;
        for(int i=0;i<nums.length;i++){
           
            if(nums[i]>0){
                pos[j]=nums[i];
                j++;
            }else{
                neg[k]=nums[i];
                k++;
            }
        }System.out.println(Arrays.toString(pos));
        System.out.println(Arrays.toString(neg));
        int l=0;
        int m=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                res[i]=pos[l];
                l++;
                
            }else{
                res[i]=neg[m];
                m++;
            
            }
        }
        return res;
    }
}
public class rearrangeBySign {
    public static void main(String[] args) {
        rearrange r= new rearrange();
        int []a={1,2,-3,-1,-2,3};
        System.out.println(Arrays.toString(r.reSol(a)));
    }
    
}

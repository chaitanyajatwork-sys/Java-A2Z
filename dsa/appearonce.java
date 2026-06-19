package dsa;

class Appear{
    public void Once(int [] nums){
        int i=0;
        int j=0;
        int c=0;
        for(i=0;i<nums.length;i++){
            c=0;
        for(j=0;j<nums.length;j++){
            if(nums[i]==nums[j])
                c++;
        }
        
        if(c==1)
            System.out.println(nums[i]);
    }
        
}
}
public class appearonce {
    public static void main(String[] args) {
        Appear ap=new Appear();
        int[]a={1,2,2,3,4,4};
        ap.Once(a);
    }
    
}

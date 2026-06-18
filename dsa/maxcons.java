package dsa;



class cons{
    public int max(int nums[]){
        int count=0;
        int maxi=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count=count+1;
                maxi=Math.max(maxi, count);
            }
            else
                count=0;

        }
        return maxi;
        
    }
}

public class maxcons {
    public static void main(String[] args) {
        cons c= new cons();
        int a[]={1,0,1,1,1,1,0,1,1,1,1,1,1,1};
        System.out.println(c.max(a));
    }
    
}

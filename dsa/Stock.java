package dsa;

class buyorsell{
    public int whhen(int[]nums){
        int min=nums[0];
        int max=nums[0];
        int index=0;
        int sell=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(min>nums[i]){
                min=nums[i];
                index=i;
            }
        }
        for(j=index;j<nums.length;j++){
            if(max<nums[j]){
                max=nums[j];
                sell=j;
            }
        }
        return sell;
    }
}
public class Stock {
    public static void main(String[] args) {
        buyorsell b= new buyorsell();
        int[]a={7,1,5,3,6,4};
        System.out.println(b.whhen(a));
    }
    
}

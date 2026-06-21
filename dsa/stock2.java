package dsa;

class buysell{
    public int when(int[]nums){
        int minPrice=nums[0];
        int maxProfit=0;
        for(int i=0;i<nums.length;i++){
            if(minPrice>nums[i]){
                minPrice=nums[i];
            }
             int Profit=nums[i]-minPrice;
            if(Profit>maxProfit){
                maxProfit=Profit;

            }
        }
    
    return maxProfit;
}
}
public class stock2 {
    public static void main(String[] args) {
        buysell bs= new buysell();
        int[]a={7,1,5,3,6,4};
        System.out.println(bs.when(a));
    }
    
}

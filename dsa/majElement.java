package dsa;
class major{
    public void ele(int[]nums){
        int count=0;
        int temp=0;
        int len=nums.length/2;
        for(int i=0;i<nums.length;i++){
            count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                    temp=nums[i];
                }
                if(count>len){
                    System.out.println("Mjority element is"+temp+"appears"+count+"times");

                }
               }
        }
        

    }
}
public class majElement {
    public static void main(String[] args) {
        major m=new major();
        int a[]={1,6,7,7,7,7,7,7,3,3};
        m.ele(a);
    }
}

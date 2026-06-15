package dsa;

class Solutionss{
    public int linear(int[]nums,int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                System.out.println("element found at index:");
                return i;
            }
            
        }
        return -1;

    }
}

public class linearSearch {
    public static void main(String[] args) {
        Solutionss s=new Solutionss();

        int a[]={1,45,65,43,98};
        int key=65;
        System.out.println(s.linear(a, key));
    }
    
}

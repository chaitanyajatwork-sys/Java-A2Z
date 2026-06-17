package dsa;

class Sol{
    public void missing(int[]nums,int limit){
        
        int j=0;

        for(int i=1;i<=limit;i++){
            if(j>nums.length||nums[j]!=i){
                System.out.printf(i+"is missing");
            
               
            }else
                j++;
            }
    
        
    }
}


public class missingNo {
    public static void main(String[] args) {
    Sol s=new Sol();

    int a[]={1,3,4,6,7};
    int n=7;

    s.missing(a, n); 
    }
}    

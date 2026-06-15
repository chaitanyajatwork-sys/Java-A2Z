package dsa;
class Binary{
    public int solution(int[]nums,int key){
        int low=0;
        int high=nums.length-1;
        
        while(low<=high){
            int mid=(low+high)/2;
         
                if(key==nums[mid])
                 return mid;
             else{
                    if(nums[mid]<key)
                      low=mid+1;
                    else
                     high=mid-1;
                }

            }
        
        return -1;
    }
}
public class binarySearch {
    public static void main(String[] args) {
        Binary b=new Binary();
        int a[]={1,2,5,6,21,35,96};
        int target=74;
        System.out.println(b.solution(a, target));


    }
    
}

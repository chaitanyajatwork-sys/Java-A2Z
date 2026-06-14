package dsa;
import java.util.*;

public class checkingsortedornot {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter length of array");
        int n=in.nextInt();
        int arr[]=new int [n];
        
        int flag=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
       

        for(int i=0;i<arr.length-1;i++){
          
                if(arr[i]>arr[i+1]){
                    flag=1;
                    break;
                }
            
            
        }
        if(flag==0){
            System.out.println("Array is sorted");

        }
        else
            System.out.println("Array is not sorted");

    
    }
    
}

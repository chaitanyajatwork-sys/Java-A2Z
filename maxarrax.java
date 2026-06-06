import java.util.*;
public class maxarrax {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int []arr=new int[5];
        System.out.println("Enter array elements");
        for(int i=0;i<5;i++){
            arr[i]=in.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<5;i++){
            if(arr[i]>max){
                max=arr[i];
            
            }
        }
        System.out.println("largest element");
        System.out.println(max);

    }
}        
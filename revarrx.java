import java.util.*;
public class revarrx {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int []arr=new int[5];
        System.out.println("Enter array elements");
        for(int i=0;i<5;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Reverse Array");
        for(int i=4;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}        
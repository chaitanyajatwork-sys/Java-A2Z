import java.util.*;

public class sumofarrax {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter 5 elements of array");
        int [] arr= new int[5];
        int sum=0;
        for(int i=0;i<5;i++){
            arr[i]=in.nextInt();
        }
        for(int j=0;j<5;j++){
            sum=sum+arr[j];
        }
        System.out.println("Sum of elemets of array");
        System.out.println(sum);


        
    }
    
}

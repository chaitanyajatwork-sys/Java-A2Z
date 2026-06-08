import java.util.*;
public class fib {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int n;
        int sum=0;
        System.out.println("Enter n");
        n=in.nextInt();
        int f1=0;
        int f2=1;
        
            for(int i=0;i<n;i++){
                System.out.println(f1+" ");
                int n3=f1+f2;
                f1=f2;
                f2=n3;
            

        }
        
    }
    
}

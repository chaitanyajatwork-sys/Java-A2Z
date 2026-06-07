import java.util.*;
public class methodmul {

    void mult(int n){
        for(int i=0;i<=10;i++){

            System.out.printf("%d x %d=%d",n,i,i*n);
            System.out.println("\n");
        }
       
        }    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("Enter n");
        n=in.nextInt();
        System.out.printf("Table of %d\n\n",n);
        methodmul obj=new methodmul();
        obj.mult(n);

    }
    
}

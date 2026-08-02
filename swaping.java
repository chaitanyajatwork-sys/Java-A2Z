import java.util.*;
public class swaping {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in );
        int a1,a2;
        int temp=0;
        System.out.println("Enter two values");
        a1=in.nextInt();
        a2=in.nextInt();
        System.out.println("Original values");
        System.out.println(a1);
        System.out.println(a2);
        temp=a1;
        a1=a2;
        a2=temp;
        System.out.println("swapped values");
        System.out.println(a1);
        System.out.println(a2);
       



        
    }
    
}

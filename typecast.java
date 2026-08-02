import java.util.*;

public class typecast{
    public static void main(String[] args) {
        int a=20;
        float b=20.6f;
        double c=20.69668;
        System.out.println("Original Values");
        System.out.printf("%d\n%.2f\n%f",a,b,c);
        System.out.println("");
        float a1=(int)a;
        int b1=(int)b;
        int c1=(int)c;
       System.out.printf("%.2f\n%d\n%d",a1,b1,c1);
    }
}
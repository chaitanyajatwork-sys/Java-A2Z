//nth TERM IF FIBONACCI

import java.util.*;
public class fibrecux {

    static int feb(int n){
        if(n==1||n==2)
            return n-1;
        else 
            return feb(n-1)+feb(n-2);
    }
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n;
        System.out.println("enter n");
        n=in.nextInt();
        System.out.println(feb(n));

    }
    
}

import java.util.*;
public class recursum {
    static int sumrec(int n){
        if(n==1){
            return 1;
        }
        return n+sumrec(n-1);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("enter n");
        n=in.nextInt();
        System.out.println(sumrec(n));

    }
}

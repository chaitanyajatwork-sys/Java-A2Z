import java.util.*;

public class strtolower {
    public static void main(String[] args) {
        System.out.println("Enter a string u want to make lower case or upper case");
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String lower=str.toLowerCase();
        String upper=str.toUpperCase();

        System.out.println("Upper case");
        System.out.println(upper);
        System.out.println("Lower Case:");
        System.out.println(lower);

    }
    
}

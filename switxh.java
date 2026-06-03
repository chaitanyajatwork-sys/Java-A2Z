import java.util.*;

public class switxh {
    public static void main(String[] args) {
        String c;
        float a,b;
        System.out.println("Enter two numbers");
        Scanner in= new Scanner(System.in);
        a= in.nextFloat();
        b=in.nextFloat();
        System.out.println("Enter your choice(+,-,/,*)");
        c=in.next();

        switch(c){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;    
            case "/":
                System.out.println(a/b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            default:
                System.out.println("Wrong Choice!!!!!!");            
        }
        

    }
    
}

package stack;
import java.util.*;

public class syntax {
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        Stack<Integer>s2=new Stack<>();

        s.push(21);
        s.push(25);
        s.push(95);
        System.out.println("Stack elements");
            System.out.println(s);
            System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s);
        
        
    }
    
}

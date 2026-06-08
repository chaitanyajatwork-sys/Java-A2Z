import java.util.*;
public class avgsum {
    static double avg(int...args){
        int sum=0;
        for(int n:args){
            sum=sum+n;
        }
        return (double) sum/args.length;
    }
    public static void main(String[] args) {
        System.out.println("average ="+avg(1,2,3,4,5,6));
        
        
    }
    
}

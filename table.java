import java.util.*;;

public class table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter n");
        n=in.nextInt();
        for(int i=0;i<=10;i++){
            System.out.printf("%d x %d=%d",i,n,n*i);
            System.out.println("\n");
        }

    }
    
}

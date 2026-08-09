import java.util.*;

public class trycatch{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[3];

        arr[0]=1;
        arr[1]=54;
        arr[2]=22;

        System.out.println("Enter the index of the array");
        int ind=in.nextInt();

        System.out.println("Enter the value u want to divide with");

        int value=in.nextInt();

        try{
            System.out.println("Entered index value:"+arr[ind]);
            System.out.println("Entered value/index value:"+arr[ind]/value);

        }
        catch(Exception e){
            System.out.println("Some error occured");
        }


    }
}
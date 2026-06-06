import java.util.*;

public class findnoinarrax {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter 5 elements of array");
        int [] arr= new int[5];

        int find;
        int findno;
        int flag=0;
        int i;
        for(int j=0;j<5;j++){
            arr[j]=in.nextInt();
        }
        System.out.println("enter the integer to find");
        find=in.nextInt();
        for(i=0;i<5;i++){
            if(find==arr[i]){
                flag=1;
                findno=i;
                break;
            }
        }
        if(flag==1){
            System.out.printf("element found at index %d",i+1);
        }
        else
            System.out.println("not found");

    }
}   
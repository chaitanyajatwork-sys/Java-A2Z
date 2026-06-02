import java.util.*;

public class per {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int totalMarks,sub1,sub2,sub3,sub4,sub5;
        float avg;
        float per;
        System.out.println("Enter total marks that can be achieved in one subject");
        totalMarks=in.nextInt();
        System.out.println("Enter marks of 5 subjects");
        sub1=in.nextInt();
        sub2=in.nextInt();
        sub3=in.nextInt();
        sub4=in.nextInt();
        sub5=in.nextInt();
        avg=(float)(sub1+sub2+sub3+sub4+sub5)/(totalMarks*5);
        System.out.println(avg);
        per=avg*100;
        System.out.println("Percentage =");
        System.out.println(per);

        

    }
    
}

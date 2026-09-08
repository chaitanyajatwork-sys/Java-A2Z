import java.util.*;
public class arraylst{
    public static void main(String[] args) {
        ArrayList<Integer>l1=new ArrayList<>();
        ArrayList<Integer>l2=new ArrayList<>();

        l2.add(64);
        l2.add(58);

        l1.add(5);
        l1.add(1,6);
        l1.add(0,56);
        l1.addAll(l2);
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
        System.out.println(l1.contains(64));
        System.out.println(l1.indexOf(58));
    }
}
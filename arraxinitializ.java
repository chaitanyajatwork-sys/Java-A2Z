public class arraxinitializ {
    public static void main(String[] args) {
        int[]marks={21,25,24,65,5};
        System.out.println("Array elements");
        for(int i=0;i<5;i++)
            System.out.println(marks[i]);
        System.out.println(marks.length); 
        for(int element:marks){
            System.out.println(element);
        }
    }
}

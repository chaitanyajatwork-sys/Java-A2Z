public class vararggs {
    static int sum(int...args){
        int sum=0;
        for(int a:args){
            sum=sum+a;
        
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(4,5,45));
    }
}

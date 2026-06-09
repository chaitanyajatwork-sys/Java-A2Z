class cir{
    double r;

    public double area(){
        return 3.14*r*r;

    }

    public double per(){
        return 3.14*2*r;
    }

    

}



public class circle {
    public static void main(String[] args) {
        cir in= new cir();
        in.r=2;
        System.out.println(in.area());
        System.out.println(in.per());
    }
    
}

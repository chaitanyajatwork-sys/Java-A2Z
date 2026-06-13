class Circle{
    double r;

    public void setr(int radius){
        r=radius;
    }
    
    public double cirArea(){
        return Math.PI*r*r;
        
    }

}

class Cyl extends Circle{
    double h;
    public void seth(int height){
        h=height;
    }
    public double cylArea(){
        return Math.PI*r*r*h;
    }
}



public class circyl {
    public static void main(String[] args) {
        Circle c= new Circle();
        Cyl cl=new Cyl();
        c.setr(2);
        cl.seth(4);
        System.out.println(cl.cylArea());
        System.out.println(c.cirArea());
        System.out.println(cl.r);
        System.out.println(cl.h);


    }
    
}

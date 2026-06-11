import java.util.Scanner;

class cylinder{
    private float height;
    private float radius;

    public cylinder(float h,float r){
        height=h;
        radius=r;
        
    }

    public void setheight(float h){
        height=h;
    }

    public void setradius(float r){
        radius=r;
    }

    public float getheight(){
        return height;
    }

    public float getradius(){
        return radius;
    }

    public float surfaceArea(){
        return 2*3.14f*radius*height+2*3.14f*radius*radius;
    }

    public float volume(){
        return 3.1f*radius*radius*height;
    }



}

class rec{
    private int height;
    private int breadth;


rec(int h,int b){
    height=h;
    breadth=b;
}

public int area(){
    return height*breadth;
}
}


public class cyl {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    cylinder in=new cylinder(12,9);
    rec on=new rec(4,2);
    // System.out.println("Enter height and radius of cylinder");
    // float h=sc.nextFloat(); 
    // float r=sc.nextFloat();
    // in.setheight(h);
    // in.setradius(r);
    


    
    System.out.println(in.getheight());
    System.out.println(in.getradius());
    System.out.println(in.surfaceArea());
    System.out.println(in.volume());
    System.out.println(on.area());

    }
    

    
}

class Base{
    int x;
    public void set(int xp){
        x=xp;
    }

     public int get(){
        System.out.println("Im in base class");
       return x;
    }
     public void Printme(){
        System.out.println("Ths is constructor");
    }
   
}

class Derived extends Base{

    int y;

    public void setY(int yp){
        y=yp;
    }

    public int getY(){
        int sum=x+y;
        return sum;
    }

}
public class inheritancx {

    public static void main(String[] args) {
        Base b=new Base();
        Derived d= new Derived();
        b.set(4);
        System.out.println(b.get());
        d.setY(2);
        d.set(2);
        System.out.println(d.getY());
    }
    
}

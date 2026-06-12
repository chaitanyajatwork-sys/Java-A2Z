class Base{
    Base(){
        System.out.println(" helloI am a constructor");
    }
}

class Subclass extends Base{
    int y;

    Subclass(){
        System.out.println("I am derived class constructor");
    }
    Subclass(int x,int y){
        System.out.println("I am "+x+" constructor of class"+y);
    }

}




public class consininheritancx {
    public static void main(String[] args) {
        //Base b=new Base();
        Subclass s=new Subclass();
        //Subclass s1=new Subclass(4, 3);
    }
    
}

class Ekclass{
    int a;

    public void var(int a){
        this.a=a;
    }
    public int getvar(){
        return a;
    }
    Ekclass(){
        System.out.println("Helloo");
    }
}

class Dusriclass extends Ekclass{
  
    Dusriclass(int x){
        super();
        
        System.out.println("I am a constructor");
    }
    
}


public class thisandsuper {
    public static void main(String[] args) {
        Ekclass e=new Ekclass();
        Dusriclass d= new Dusriclass(5);
        e.var(200);
        
        System.out.println(e.getvar());
       
    }
}

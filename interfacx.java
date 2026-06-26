interface Bicycle {
    void Speedup(int increment);
    void Speeddown(int decrement);

}

class Avon implements Bicycle{
    void blow(){
        System.out.println("peeee peee");
    }
    public void Speedup(int increment){
        System.out.println("Speeding up");
        
    }
    public void Speeddown(int decrement){
        System.out.println("speeddowning");
    }

}

public class interfacx {
    public static void main(String[] args) {
        Avon a=new Avon();
        int b=2;
        int c=3;
        a.Speedup(b);
        a.Speeddown(c);

        
    }

    
}

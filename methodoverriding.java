class A{
    int a;
    public void method1(){
        System.out.println("I am method1 of class A");
    }
}

class B extends A{
    int b;

    public void method1(){
        System.out.println("I am method 1 of class B");
    }
    public void method2(){
        System.out.println("I am method 2 of class B");
    }
}






public class methodoverriding {
    public static void main(String[] args) {
        A a= new A();
        B b =new B();
        a.method1();
        b.method1();
        b.method2();

    }
  
    
}

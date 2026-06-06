public class methoxoverloadinx {
    static void foo(){
        System.out.println("Hiiii");
    }

    static void foo(int a){
        System.out.println("Hiii"+ a +"bro");
    }

    static void foo(float a){
        System.out.println("Hii"+ a +"broooo");
    }

    static void foo(int a ,int b){
        int sum=a+b;
        System.out.println(sum);
    }
    public static void main(String[] args) {

        foo();
        foo(300);
        foo(300f);
        foo(3,5);

        
    }
    
}

class Thread1 extends Thread{
    public void run(){
        int i=0;
        while(i<50){
            System.out.println("Cooking");
            i++;
        }
    }
}


class Thread2 extends Thread{
    public void run(){
        int i=0;
        while(i<50){
            System.out.println("Chatting");
            i++;
        }
    }
}

public class multithread{
    public static void main(String[] args) {
        Thread1 t=new Thread1();
        Thread2 t1=new Thread2();
        t.start();
        t1.start();
    }
}
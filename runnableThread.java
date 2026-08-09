class Thread1 implements Runnable{
    public void run(){
        int i=0;
        while(i<30){
            System.out.println("Heloo i'm runnableThread1");
            i++;
        }
    }
}

class Thread2 implements Runnable{
    public void run(){
        int i=0;
        while(i<30){
            System.out.println("I am runnableThread2");
            i++;
        }
    }
}

public class runnableThread{
    public static void main(String[] args) {
        Thread1 t=new Thread1();
        Thread gun=new Thread(t);
        Thread2 t1= new Thread2();
        Thread gun2=new Thread(t1);

        gun.start();
        gun2.start();


    }
}
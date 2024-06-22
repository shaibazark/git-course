class A extends Thread{

    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("In AAAAAAAAAA Show");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {

    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("In Show BBBBBBBB");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();


        a.setPriority(10);
        System.out.println(a.getPriority());
        a.start();
        b.start();
    }
}


interface A{
    int age=10;
    String area="ok";
    void play();
    void Fly();
}

interface X{
    
    void run();
}

class b implements A,X{
    public void play(){
        System.out.println("Playing");
    }
    public void Fly(){
        System.out.println("Flying");
    }
    public void run(){
        System.out.println("Running");
    }
}

public class Interface {
    public static void main(String[] args) {
     
       /* A a;
        a = new A() {
            public void play(){
                System.out.println("Playing");
            }
            public void Fly(){
                System.out.println("FLying");
            }
        };
        a.Fly();*/
        b a = new b();
        a.play();
        a.Fly();
        a.run();
        System.out.println(A.age);
        System.out.println(A.area);
    }
}

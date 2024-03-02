abstract class A{

    public abstract void show();
}

public class AbstractAnonymousClass {
    public static void main(String[] args) {
        //now if we dont want to create subclass only ti implement the show method we can use anonymous concept
        A a = new A() {
            public void show(){
                System.out.println("anonymous abstract method implemented");
            }
        };

        a.show();
    }
}

class A {

    public void show(){
        System.out.println("A show");
    }
}
class B extends A{
    public void show(){
        System.out.println("B show");
    }
}
class C extends A{
    public void show(){
        System.out.println("C show");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        A obj = new A();  //type can be parent and object can be a child
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();

    }
}

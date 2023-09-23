class A{

    public A(){
        super();
        System.out.println("In A");
    }
    public A(int a){
        super();
        System.out.println("In A int");
    }
}
class B extends A{
    public B(){
        //super(5);
        System.out.println("In B");
    }

    public B(int a){
        //super();
        
        this();
        
        System.out.println("In B int");
    }
}

public class ThisSuperKeyword {
    public static void main(String[] args){
        //B obj1 = new B();
        B obj2 = new B(5);

    }
}

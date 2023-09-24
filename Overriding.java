class A{
    public void show(){
        System.out.println("from A show");
    }
    public void config(){
        System.out.println("from A config");
    }
}
class B extends A{
    public void show(){
        System.out.println("from B show with additional feature");
    }
}
public class Overriding {
    public static void main(String[] args){
        B obj = new B();
        obj.show();
        obj.config();
    }
}

class A{

    void showTheDataWhichBelongstoThisClass(){
        System.out.println("in A");
    }
}
class B extends A{
    @Override
    void showTheDataWhichBelongstoThisClass(){
        System.out.println("in B");
    }
}


public class Annotation {
    public static void main(String[] args) {
        B b = new B();
        b.showTheDataWhichBelongstoThisClass();
    }
  
}

class A {

    public void show1(){
        System.err.println("in A Show");
    }
}

class B extends A{
    public void show2(){
        System.out.println("in B Show");
    }
}

public class UpcastingAndDowncasting {
    public static void main(String[] args) {
        double d=4.5;
        //    	int i=(int)d;
        //    	
        //    	System.out.println(i);
                
        //    	A obj= new A();
        //    	A obj=(A) new B();   //upcasting
        //    	obj.show1();
                
                A obj=(A)new B();  // this is upcasting
                obj.show1();
                //obj.show2();     // we can not call this method from B

                B obj1=(B)obj;    // this down casting
                obj1.show2();
                obj1.show1();   // bcos of inheritance
    }
}

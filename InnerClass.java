class A{

    int age = 10;

    public void show(){
        System.out.println("it is showiing");
    }
   
    static class B{
        
        public void config(){
            System.out.println("Configuration is runnning from B");
        }

    }
}

class InnerClass {

    public static void main(String[] args) {
        A a = new A();
        a.show();

        //  A.B b = a.new B();  // if innner class not static
        A.B b = new A.B(); // if inner class is static
        b.config();
    }
}

class A{

    public void show(){
        System.out.println("A showing");
    }

    public void fly(){
        System.out.println("A flying");
    }
}

class B extends A{

    public void show(){
        System.out.println("in B show");
    }
}






class AnonymousInnerClass {
    public static void main(String[] args) {
      
        A a= new A(){
            public void show(){
                System.out.println("in new show");
            }

            public void fly(){
                System.out.println("new Flying");
            }
        };
        a.show();
        a.fly();
       //A a = new B();
       //a.show();
    }
}

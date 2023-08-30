class example {
    int a;
    float f;
    char c;
    boolean b;
    public void add(){
        System.out.println(a);  //0
        System.out.println(f);  //0.0
        System.out.println(c);  //nothing
        System.out.println(b); //false
    }

     public void add(int a,float f,char c,boolean b){
        System.out.println(a);  //0
        System.out.println(f);  //0.0
        System.out.println(c);  //nothing
        System.out.println(b); //false
    }
}

public class InstanceLocalVar {
    int a;
    public static void main(String[] args) {
        System.out.println("ok");
        
        example e = new example();
        e.add();
        int a;
        float f;
        char c;
        boolean b;
        //e.add(a,f,c,b);  // we cannot pass withouth initializing a local variable
    }
}

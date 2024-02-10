class calc {

    public void show(){
        System.out.println("show method");
    }

    public void addition(int a, int b){
        System.out.println(a+b);
    }
     
}


public class Final {
    
    public static void main(String[] args) {
        final int pie = 314;   // Final Variable
        System.out.println(pie);
        calc c = new calc();
        c.show();
        c.addition(1, 2);
    }
}

public class IfElse {

    public static void main(String[] args) {
        
        int a = 9 ;
        if(a>5 && a<20)
        System.out.println("Hello");
        else
        System.out.println("Bye");


        int x = 10;
        int y = 20;
        int z = 15;
        if(x>y && x>z)
        System.out.println("largest"+x);
        else if(y>z)
        System.out.println("largest"+y);
        else
        System.out.println("largest"+z);
    }
    
}

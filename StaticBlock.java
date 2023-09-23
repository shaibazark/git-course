
class Mobile{

    int year;
    static String model;
    int price;


    static {
        model="XT";
         System.out.println("in static");
    }
    public Mobile(){
        year =2000;
        //model="XT";  // but it will everytime initialise static variable not good
        price=1900;
         System.out.println("in cons");
    }
}

public class StaticBlock{
    
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("main");

        Class.forName("Mobile"); // this will execute only static block
        //Mobile m = new Mobile();
        //System.out.println(m.year);
    }
    
}

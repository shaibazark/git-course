
class Mobile {

    int year;
    static String model = "XT";
    int price;
    
    public void print(){
        System.out.println(year+ " " +model+ " " +price);
    }

    public static void show(){
        //System.out.println(year+ " " +model+ " " +price); // this will give an error as we cann not call non static var into static maethod
        System.out.println(model);

    }

    public static void show1(Mobile obj){
        System.out.println(obj.year+ " " +model+ " " +obj.price);
    

    }
}

public class StaticMethods {
    public static void main(String[] args) {

        Mobile sm = new Mobile();
        Mobile sm1 = new Mobile();
        Mobile sm2 = new Mobile();

        sm.year = 2021;
        sm.price =5000;

        sm1.year = 2022;
        sm1.price =1000;

        sm2.year = 2023;
        sm2.price =500;

        sm.print();
        sm1.print();
        sm2.print();

        //sm.show();  // this will give an error
        Mobile.show();

        Mobile.show1(sm);
        
    }
}

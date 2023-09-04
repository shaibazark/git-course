class Mobile {

    String brand;
    static String name="xt";
    int price;

    public void print(){
        System.out.println(brand+ ":"+name+":"+price);
    }
}
public class StaticVariable {

    public static void main(String[] args) {
        Mobile m = new Mobile();
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();

        m.brand="Sm";
        m.price=1500;
        //Mobile.name="xt";

        m1.brand="aa";
        m1.price=100;
        //Mobile.name="xt";
        
        m2.brand="bb";
        m2.price=800;
        //Mobile.name="xt";

        m.print();
        m1.print();
        m2.print();

    }
}

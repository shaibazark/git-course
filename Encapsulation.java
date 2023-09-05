
class Mobile{

    private int year = 2000;
    private String name = "Apple";
    
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
}
public class Encapsulation {
    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.setYear(5000);
        m.setName("Iphone");
        System.out.println(m.getYear()+ " : " +m.getName());


    }
}

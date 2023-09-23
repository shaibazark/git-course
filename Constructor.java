class Human{

    int age;
    String name;

    public Human(){
       age = 12;
       name = "Babu";

    }
}

public class Constructor {
    public static void main(String[] args){
       Human obj = new Human();
       System.out.println(obj.name + ":" + obj.age);
        
    }
}

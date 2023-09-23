class Human{
    int age;
    String name;


    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Human(){
        age =12;
        name="Shyam";
    }

}

public class ParametrizedConstructor {
    
    public static void main(String args[]){
    Human obj = new Human(20,"Shaibaz");
    System.out.println(obj.age+":"+obj.name);

    }
}

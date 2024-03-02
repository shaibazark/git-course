abstract class Car {
    public abstract void fly();
    public abstract void drive();
    public void playMusic(){
        System.out.println("Playing Music");
    }
}

abstract class WagonR extends Car{

    public void drive(){
        System.out.println("Driving Car");
    }
}
 class updatedWagonR extends WagonR{   //concrete class

    public void fly(){
        System.out.println("car is flying");
    }
 }
class Abstract{

    public static void main(String[] args) {
        Car c = new updatedWagonR();

        c.drive();
        c.playMusic();
        c.fly();
    }
}
import Other.AccessModi;

class C extends AccessModi{
    
    public void show(){
    System.out.println(count);
    }
}

public class AccessModifier {
    public static void main(String[] args) {
        AccessModi obj = new AccessModi();
        C obj1 = new C();
        //int b = obj1.count; //not  accessible
        //obj.marks;
        //obj.age;
        int a = obj.per;
    }
}

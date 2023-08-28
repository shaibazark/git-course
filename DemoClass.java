
class calculator {

    public int add(int a, int b){
        System.out.println("addition : "+ (a+b));
        return 1;
    }

}

public class DemoClass {
    public static void main(String[] args) {
        int num1=5, num2=4;

        //int res = num1+num2;
        calculator c = new calculator();
        int res = c.add(num1,num2);

        System.out.println(res);
    }
    
}

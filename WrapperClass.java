public class WrapperClass {
    public static void main(String[] args) {
        int num =7;

        //Integer num1 = new Integer(num);  // boxing
        num1 = num; //autoboxing

        int num2 = num1.intValue();  // unboxing

        System.out.println(num2);

        String s = "7";

        int i = Integer.parseInt(s);

        System.out.println(i);


    }
}

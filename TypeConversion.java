class TypeConversion
{

public static void main(String[] args){

    System.out.println("Hello World......");
    
    byte num2 = 127;
    int num = 256;
    byte k = (byte) num;
    //float a = 5.6f;
    //int b = a;
    System.out.println(k);

    float f = 5.6f;
    int c = (int)f;  // this is known as Type casting
    System.out.println(c);

    byte a = 10;
    byte d= 30;
    int res = a*d;
    System.out.println(res); // this is known as Type promotions

}
}
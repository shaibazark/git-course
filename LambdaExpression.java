
@FunctionalInterface
interface A{

    //int a =10;
    int show(int i,int s);
      
}

public class LambdaExpression {
    
    public static void main(String[] args) {

        int sum;
        A a = new A() {
            public int show(int i,int s){
                System.out.println("Interface show method"+ (i+s));
                return i+s;
            }
        };

        A b = (i,s) -> {
            System.out.println(i);
           return  i+s;
        }; // if method accept parameter 

       //  A b = i -> System.out.println( "ok"+i); // if we have only one variable as parameter thenno need bracket

        sum = a.show(17,10);
        System.out.println(sum);
        sum = b.show(5,10);
        System.out.println(sum);

    }
}

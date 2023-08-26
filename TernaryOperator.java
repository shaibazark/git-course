public class TernaryOperator {
    public static void main(String[] args) {
        
        int n =4;
        int res = 0;

        //using IF Else
        if(n%2==0)
        res = 10;
        else 
        res = 20;

        System.out.println(res);

        //Using ternary Operator
        res = n%2==0 ? 10 : 20 ;
        System.out.println(res);

        n++;
        if(n==4)
        System.out.println("true");
        else
        System.out.println("false");
    }
    
}

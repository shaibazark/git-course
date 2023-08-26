public class LogicalOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 12;
        int c = 13;
        boolean f = a<b || a>c ;
        System.out.println(f);

        f = a<b && a<c ;
        System.out.println(f);

         f = a<b && a>c ;
        System.out.println(f);
    }
    
}

public class AssignmentOperator {
    
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 8;
        int res = num1+num2;
        System.out.println(res);

        res = num2-num1;
        System.out.println(res);

        res = num2*num1;
        System.out.println(res);

        res = num2/num1;
        System.out.println(res);

        res = num2%num1;
        System.out.println(res);

        num1 += 2;//add num1 by 2
        System.out.println(num1);

        num1 -= 5;//minus num1 by 5
        System.out.println(num1);

        num1 *= 5;//multiple num1 by 5
        System.out.println(num1);

        num1 = 10 ;
        res = num1++;  // post increment
        System.out.println(res);

        num1--;  // increment
        System.out.println(num1);

        res = ++num1;  // pre increment
        System.out.println(res);

    }
}

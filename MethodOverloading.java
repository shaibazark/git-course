class Calc {

    public int add (int n1, int n2){

        return n1+n2;
    }

    public double add (double n1, double n2){

        return n1+n2;
    }
}

public class MethodOverloading {

    public static void main(String[] args) {
        Calc c = new Calc();
        double res = c.add(4.5,5.5);
        System.out.println(res);
    }
    
}

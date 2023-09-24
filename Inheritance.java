class Calc{
    int num =5;
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
}

class AdvCalc extends Calc{
    int num=10;
    public int add(int a,int b){
        System.out.println("inside AdvCalc");
        return a+b;
    }
    public int multi(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }
}

class SciCalc extends AdvCalc{
    
    public double power(double a,double b){
        return Math.pow(a,b);
    }
    
}

public class Inheritance {
    public static void main(String[] args){
        //Calc c = new AdvCalc();
        SciCalc c = new SciCalc();
        int res = c.add(5,9);
        int res1 = c.sub(15,9);
        int res2 = c.multi(5,9);
        int res3 = c.div(18,9);
        double res4 = c.power(2,4);
        System.out.println(res +":"+res1);
        System.out.println(res2 +":"+res3);
        System.out.println(res2 +":"+res3);
        System.out.println(res4);
        //System.out.println(c.num);
    }
}

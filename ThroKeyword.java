class ShaibazException extends RuntimeException{  
    // class of exception we need to extends Runtimeexception or Excecption class

    public ShaibazException(String str){
        super(str);
    }
}

public class ThroKeyword {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        try
        {
            j=18/i;
            if(j==0)
                throw new ShaibazException("I dont want to print 0");
        }
        catch(ShaibazException e)
        {
            System.out.println("Thats new custom exception    ::   "+e);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Thatdefault output"+e);
        }
        System.out.println(j);
    }
}

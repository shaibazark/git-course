public class ExceptionProgram {
    
    public static void main(String[] args) {
        int i=2;
        int j=0;
        int[] a = new int[4];
        String s = null;

        try
        {
        j=18/i;
        System.out.println(a[3]);
        System.out.println(s.length());
        }
        catch(ArithmeticException e) // child exception if we declare Excetion 
        // above this child exception thenit will throw an error
        {
            System.out.println("Number divide by Zero");
        }
        catch(ArrayIndexOutOfBoundsException e) // these are child exception
        {
            System.out.println("Array index out of bound exception");
        }
        catch(Exception e)   // exception is parent it will always come at bottom 
        {
            System.out.println("something went wrong"+e);
        }
        System.out.println(j);
        System.out.println("bye");
    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Finally {
    public static void show(){

        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Please enter");
            Integer p = Integer.parseInt(br.readLine());
            System.out.println("Here value is "+p);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public static void main(String[] args) {
        
        int i=0;
        int j =0;
        try{
            j=18/2;
        }
        catch(AbstractMethodError e){
            System.out.println("Exception occured"+e.getMessage());
        }
        finally{
            System.out.println("Bye"); // it will always execute either
            //exception occure or not

        }

        show();

    }
    
}

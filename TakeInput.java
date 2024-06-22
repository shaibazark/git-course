import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        int num=0;
        System.out.println("Enter Any Number");
        //InputStreamReader is = new InputStreamReader(System.in);
       // BufferedReader br = new BufferedReader(is);
       ///num = Integer.parseInt(br.readLine());
        Scanner sc = new Scanner(System.in);
       
        num = sc.nextInt();

        //br.close(); // it is better to close th resource ..
        //good practice
        System.out.println(num);
    }
}

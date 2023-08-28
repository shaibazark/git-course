public class Loop {
    public static void main(String[] args) {
        int i =1;
        while(i<=5){
               
            System.out.println("Hi"+i);
            int j = 1;
            while(j<=3){
               System.out.println("Hello"+j); 
               j++;
            }
            ++i;
        }

      
            /// do while
            int z = 10;
            do
            {
                System.out.println("Hello"+z); 
                z++;
            } while(z<=5);

            //for Loop

            for(int x =1;x<=5;x++){
                System.out.println("Days"+x); 
                for(int j=1;j<=9;j++){
                    System.out.println("Hours"+j); 
                }
            }
            
            for(int x=1;x<=5;){
                System.out.println("Days"+x); 
                for(int j=1;j<=9;j++){
                    System.out.println("Hours"+j); 
                }
            }

    }
    
}

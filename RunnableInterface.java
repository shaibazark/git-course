// class A implements Runnable{
//     public void run(){
//         for(int i=0;i<10;i++)
//             System.out.println("Hi AAAAA");
//     }
// }

// class B implements Runnable{
//     public void run(){
//         for(int i=0;i<10;i++)
//             System.out.println("Hi BBBBB");
//     }
// }

public class RunnableInterface {
    public static void main(String[] args) {

        Runnable obj1 = () -> 
        {    
                         for(int i=0;i<10;i++)
                            System.out.println("Hi AAAAA");
                    
        };
        Runnable obj2 = new Runnable() {
            public void run(){
                for(int i=0;i<10;i++)
                    System.out.println("Hi BBBBB");
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start(); 
    }
}

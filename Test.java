public class Test {

    public static void main(String[] args) {
        
        int i =5;
        System.out.println(++i); // first increment then perform operation

        int j =5;
        System.out.println(j++);//first print then perform increment
        int z = ++j + 5;
        System.out.println(z);
        System.out.println(++z); //
    }
    
}

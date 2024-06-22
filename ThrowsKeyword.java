class Print {
    
    public void show() throws InterruptedException{
        System.out.println("Sample Print Method");
        Thread.sleep(1000);
    }
}

public class ThrowsKeyword {

    public static void main(String[] args) throws InterruptedException {
        // here main methosd is also throws keyword
        //means hey HVM handle my exception
        Print p = new Print();
        p.show();
    }
}

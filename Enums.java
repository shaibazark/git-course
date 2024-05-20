enum Status{
    Running,Faillin,Progress,Passed;
}

public class Enums {
    public static void main(String[] args) {
        
        Status s = Status.Passed;
        System.out.println(s);
        //Status[] ss = Status.values();
        //System.out.println(ss);
       // for(Status s1 : ss){
          //  System.out.println(s1);
       // }
       Status s = Status.Passed;
        switch (s) {
            case Running:
                System.out.println("wait");
                break;
            case Faillin:
                System.out.println("Failed");
                break;
            default:
                System.out.println("inavlid option");
                break;
        }
    }
}

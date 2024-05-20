
interface Computer{
    void show();
}

class laptop implements Computer{

    public void show(){
        System.out.println("compile code run :  laptop");
    }
}


class desktop implements Computer{

    public void show(){
        System.out.println("compile code run : desktop");
    }
}
class developer {

    public void devApp(Computer comp){
        comp.show();
    }
}


public class InterfaceNeed {
    
    public static void main(String[] args) {
        Computer l = new laptop();
        Computer de = new desktop();
        
        developer d = new developer();
        d.devApp(de);
    }
}

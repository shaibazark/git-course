
class computer {

    public void playmusic(){
        System.out.println("Playing Music");
    }

    public String getPen(){
        return "Reynolds";
    }
}

public class Methods {

    public static void main(String[] args) {
        
        computer co = new computer();
        co.playmusic();
        String penNameString = co.getPen();
        System.out.println(penNameString);
    }
    
}

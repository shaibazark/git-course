public class SwitchStatement {
    public static void main(String[] args) {
        
        int n =8;
        String s = "Monday";
        switch (n) {
            case 1:   // if it is String then    case "Monday":
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Not Correct Option");
                break;
        }
    }
    
}

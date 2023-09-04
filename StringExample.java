public class StringExample {
    public static void main(String[] args) {
    
        String var1 = new String("shaibaz");
        String var2 = "AAA";
        System.out.println("Hello " + var1);
        System.out.println(var1.charAt(1));
        System.out.println(var1.concat(" Arkate"));
        System.out.println(var1);
        String var3 = "AAA";
        String var4 = "AAA";
        String var5 = new String("AAA");
        String var6 = new String("AAA");
        System.out.println(var3 == var4);
        System.out.println(var3.equals(var4));
        System.out.println(var5 == var6);
        System.out.println(var5.equals(var6));
        System.out.println(var3 == var5);
        System.out.println(var3.equals(var5));
        System.out.println(var5);
        System.out.println(var6);

    }
}

public class StringPrac {
    public static void main(String[] args) {
        
        String name = new String("shaibaz");

        String name1 = "AAA";
        System.out.println("Hello " +name);
        System.out.println(name.charAt(1));

        System.out.println(name.concat(" Arkate"));
        System.out.println(name);

        String s1 = "AAA";
        String s2 = "AAA";

        String s3 = new String("AAA");
        String s4 = new String("AAA");
        System.out.println(s1 == s2);

        System.out.println(s1.equals(s2));

        System.out.println(s3 == s4);

        System.out.println(s3.equals(s4));

        

    }
}

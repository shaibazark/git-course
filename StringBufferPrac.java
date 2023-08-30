public class StringBufferPrac {
    public static void main(String[] args) {
        StringBuffer strb = new StringBuffer();
        System.out.println(strb.capacity());

        StringBuffer st2 = new StringBuffer("Shaibaz");
        st2.append(" Arkate");
        System.out.println(st2);

        st2.deleteCharAt(1);
        System.out.println(st2);

        st2.insert(0,"Java ");
        System.out.println(st2);

        st2.setLength(20);
        System.out.println(st2);

        st2.ensureCapacity(100);
        System.out.println(st2);

    

    }
}

public class Array {
    public static void main(String[] args) {
        
        int j=0;
        float f=0;
        boolean b;
        int nums[] = {1,10,11};
        
        for (int i =0;i<nums.length;i++)
        {
            System.out.println(nums[i]);

        }

        
        int num1[] = new int[4];
        int[] a = new int[10];
        System.out.println(num1[1]);
        num1[0] = 8;
        num1[1] = 9;
        num1[2] = 10;
        num1[3] = 11;

        a[1] = 10;

        for (int i =0;i<num1.length;i++)
        {
            System.out.println(num1[i]);

        }
        System.out.println(a[1]);
    }
}

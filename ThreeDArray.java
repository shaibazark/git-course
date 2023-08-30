public class ThreeDArray {
    public static void main(String[] args) {
        
        int num[][][] = new int [3][4][4];
        
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                for(int k=0;k<num[i][j].length;k++){
                    num[i][j][k] = (int)(Math.random()*10);
                }
                //System.out.print(" ");
            }
            //System.out.println();
        }


        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                for(int k=0;k<num[i][j].length;k++){
                    //num[i][j][k] = (int)(Math.random()*10);
                    System.out.print(num[i][j][k]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

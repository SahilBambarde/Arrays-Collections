public class PlayWithSyntax {
    public static void main(String[] arg){
        int[] x1;

        int [] x2;

        int x3[];

        //int[3] X4; //Error // At the time of declaration we cannot specify the size //complile time error

        int x5[],x6[];

        //int x7[], []x8; //compile time error //square bracket places wrong

        int[]x9,x10[];

        int[][] x11;

        int [][]x12;

        int [][] x13;

        int[]x14[];

        int x15[][];

        int[][] x16,x17;

        int[] x18[],x19; //x18 is 2D array and x19 is 1D array

        int[] []x20,x21; //x20 is 2D and x21 is 1D

        int [] [] [] x22, x23;

        //-----------------------------

        //int [][] x24 = new int[][4]; //please provide previous level size before next level size

        int [][][] x25 = new int[3][4][5];

        int[][][] x26 = new int[3][4][];

        //int[][][] x27 = new int[3][][5]; //please provide previous level size before next level size

        //int[][][] x28 = new int[][4][5]; //please provide previous level size before next level size


    }
}

public class MultiDimensionalArrays {
    public static void main(String[] arg){
        int[][] x = new int[3][];

        int[] y = new int[3];

        y[0]=12;
        y[1]=13;
        y[2]=14;

        System.out.println(y[0]);
        System.out.println(y[1]);
        System.out.println(y[2]);

        x[0] = new int[3];
        x[1]= new int[1];
        x[2]= new int[2];

        //x[2]= 14; //java: incompatible types: int cannot be converted to int[]

        int[][][] z = new int[2][][];
        z[0] = new int[3][];
        z[1] = new int[2][];

        z[0][0] = new int[3];
        z[0][1]=new int[1];
        z[0][2]=new int[2];

        z[0][0][0] = 1;
        z[0][0][1] = 2;
        z[0][0][2] = 3;

        //dimention limit is 55


    }
}

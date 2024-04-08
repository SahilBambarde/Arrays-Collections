import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] arg){
        int[] x;

//        x={1,2,3};
        //java: illegal start of expression

        int[] y = {1,2,3,4,5};

        int[] z = new int[3];

        System.out.println(z[0]); //0
        System.out.println(z[1]); //0
        System.out.println(z[2]); //0

        int x1;
        //System.out.println(x1); //java: variable x1 might not have been initialized

        z[0]=10;
        z[1]=20;
        z[2]=30;
//        System.out.println(z[0]);
//        System.out.println(z[1]);
//        System.out.println(z[2]);

        for(int ele: z){
            System.out.println(ele);
        }

        System.out.println(z); // [I@e9e54c2

        //----------------------------------

        int[][] a;

        int[][] b = new int[2][];

        System.out.println(Arrays.toString(b[0])); //null
        //System.out.println(Arrays.toString(new int[]{b[0][0]})); //java.lang.NullPointerException: Cannot load from int array because "b[0]" is null

        b[0] = new int[2];
        b[1]= new int[3];
        System.out.println(b[0][0]); //0

        b[0][0] = 55;
        System.out.println(b[0][0]); //55

        int[][] c = {{1,2,3},{6,7}};

        for(int[] array: c){
            for(int ele : array){
                System.out.println(ele);
            }
        }
        //1
        //2
        //3
        //6
        //7



    }
}

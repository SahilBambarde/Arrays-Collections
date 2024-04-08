public class ArraysIntroduction {
    public static void main(String...a){
        int a1 = 12;
        int b= 13;
        int c = 14;

        int[] x = new int[1000];
        System.out.println(x.getClass().getName()); //[I

        int[] y = new int[0];

        int[] z = new int['a'];

        int[] z1 = new int[-1]; //java.lang.NegativeArraySizeException: -1

        //int[] z2 = new int[65467657657457456746574644767];  //java: integer number too large

    }
}

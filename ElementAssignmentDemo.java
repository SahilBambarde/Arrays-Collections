public class ElementAssignmentDemo {
    public static void main(String[] ar){
        /*
         * Array can hold 4 types of elements
         * 1.primitive types
         * 2.objects
         * 3.Abstract class type
         * 4.interface type
         * */

        //primitive
        int[] x = new int[3];
        float[] y = new float[2];
        //byte
        //short
        //long
        //char
        //float
        //double

        x[0]='a';
        System.out.println(x[0]); //97

        byte b =2;
        x[1]=b;
        System.out.println(x[1]); //2

        //----------------------------------------------------

        Object[] objArray = new Object[5];
        objArray[0] = new Object();
        objArray[1] = new String();

        //-----------------------------------------------------------

        Number[] numArray = new Number[3];
        numArray[0] = new Integer(1);
        numArray[1] = new Byte("2");

        //--------------------------------------------

        Runnable[] r = new Runnable[5];
        r[0] = new Thread();
        System.out.println(r[0]); //Thread[Thread-0,5,main]
        System.out.println(r[1]);// null





    }
}

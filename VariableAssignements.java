public class VariableAssignements {
    public static void main(String args[]){
        int[] x = new int[2];
        int[] a = x;
        x[0]=1;

        System.out.println(x[0]); //1
        System.out.println(a[0]); //1
        a[1]=2;
        System.out.println(x[1]); //2
        System.out.println(a[1]); //2

        System.out.println();
        //------------------------------------------------------

        int[] b = {1,2,3};
        int[] c = {11,22};
        b=c;
        c=b;

        for(int e:b){
            System.out.println(e);
        }
        //11
        //22

        for(int e:c){
            System.out.println(e);
        }
        //11
        //22

        //-------------------------------------------------------------
        System.out.println();

        String[] s = new String[3];
        Object[] objArr = s;

        short[] shorts = new short[2]; //[S
        //int[] ints = shorts; //java: incompatible types: short[] cannot be converted to int[] //[I





    }
}

public class TravesingArrays {
    public static void main(String[] args){
        int[] a = new int[5];


        for(int e: a){
            System.out.println(e);
        }
        //0
        //0
        //0
        //0
        //0

        int length = a.length;
        for(int i =0;i<length;i++){
            a[i]=i+1;
            System.out.println(a[i]);
        }
        //0
        //0
        //0
        //0
        //0

        //a[i]=+1;
        //1
        //1
        //1
        //1
        //1

        //a[i]=i+1;
        //1
        //2
        //3
        //4
        //5

        //-----------------------------------------------

        int[][] b = new int[2][3];

        for(int[] arr: b){
            for(int e: arr){
                System.out.println(e);
            }
        }
        //0
        //0
        //0
        //0
        //0

        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                System.out.println(b[i][j]);
            }
        }
        //0
        //0
        //0
        //0
        //0










    }
}

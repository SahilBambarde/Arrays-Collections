public class AnonymousArrays {
    public static void main(String[] args){
        int[] a = new int[] {1,2,3};
        sum(new int[] {1,2,3});
    }
    public static void sum(int[] s){
        int total = 0;
        for(int i:s){
            total=total+i;
        }
        System.out.println(total); //6
    }
}

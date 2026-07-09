public class BlockScope {
    public static void main(String[] args){
        int a=5;
        int b=8;
        a=67;
        {
            a=7;
            int c=9;

        }
        System.out.println(a);
//        System.out.println(c);
    }
}

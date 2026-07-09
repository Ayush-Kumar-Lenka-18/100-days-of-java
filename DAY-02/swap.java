public class swap {
    public static void main(String[] args) {
        int a=12;
        int b=11;
        swaping(a,b);
    }
    static void swaping(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.print(a+" "+b);
    }
}

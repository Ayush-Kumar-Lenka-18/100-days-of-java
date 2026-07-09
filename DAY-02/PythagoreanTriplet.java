import java.util.*;
public class PythagoreanTriplet {
    public static void main(String[] args) {
        System.out.println("Enter three Integers:");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        System.out.println("The given integer:"+n1+","+n2+","+n3+"is PythagoreanTriplet:"+isPythagoreanTriplet(n1,n2,n3));

    }
    static boolean isPythagoreanTriplet(int n1, int n2, int n3) {
        int max=Math.max(n1,Math.max(n2,n3));
        int c=n1*n1+n2*n2+n3*n3-max*max;
        if(max*max==c){
            return true;
        }else{
            return false;
        }
    }
}

import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("The factorial of "+n+" is:"+factor(n));
    }
    static int factor(int n){
        int fact=1;
        for(int i=n;i>0;i--){
            fact*=i;
        }
        return fact;
    }
}

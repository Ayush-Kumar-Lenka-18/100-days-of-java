import java.util.*;
public class pallindrome{
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("The number "+n+" is: "+pal_verifier(n));
    }
    static String pal_verifier(int n){
        int pal=0;
        int original = n;
        while(n!=0) {
            int rem = n % 10;
            pal = pal * 10 + rem;
            n = n / 10;
        }
        if(pal==original) {
            return "palindrome";
        }
        else {
            return "not palindrome";
        }
    }
}

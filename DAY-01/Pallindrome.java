import java.util.*;
public class Pallindrome {
    public static void main(String[] args){
        System.out.print("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int rev=0;
        while(n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(rev==temp){
            System.out.println("The no."+temp+" is a pallindrome.");
        }
        else{
            System.out.println("The no."+temp+" is not a pallindrome.");
        }
    }
}

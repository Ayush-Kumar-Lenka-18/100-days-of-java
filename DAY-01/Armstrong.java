import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter the no.");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        String StVal=Integer.toString(n);
        int len=StVal.length();
        int arm=0;
        while(n!=0){
            int rem=n%10;
            arm+=(int)(Math.pow(rem,len));
            n=n/10;
        }
        if(temp==arm){
            System.out.println("The no."+temp+" is an Armstrong no..");
        }
        else{
            System.out.println("The no."+temp+" is not an Armstrong no..");
        }
    }
}

import java.io.*;
import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("The no. is:"+verifier(n));
    }
    static String verifier(int n){
        if(n%2==0){
            return "even";
        }
        else{
            return "odd";
        }
    }
}

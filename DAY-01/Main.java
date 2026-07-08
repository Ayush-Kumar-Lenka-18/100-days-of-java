//Write a program to print the sum of negative numbers,
// sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N)
// entered by the user. The list terminates when the user enters a zero.
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sum3=0;
        int sum2=0;
        int sum1=0;
        while(true){
            System.out.println("Enter a number:");
            int n=sc.nextInt();
            if(n<0){
               sum1+=n;
            }
            else if(n>0){
                if(n%2==0){
                    sum2+=n;
                }
                if(n%2!=0){
                    sum3+=n;

                }
            }
            if(n == 0){
                break;

            }
        }
        System.out.println("sum of -ve integer:"+sum1);
        System.out.println("sum of +ve even  integer:"+sum2);
        System.out.println("sum of +ve odd integer:"+sum3);
    }
}
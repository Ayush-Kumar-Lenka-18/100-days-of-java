import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        System.out.println("Enter the no.");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c;
        int count=2;
        System.out.print("Fibonacci Series is:-"+a+","+b+",");
        while(count< n){
            c=a+b;
            a=b;
            System.out.print(c+",");
            b=c;
            count++;

        }
    }
}

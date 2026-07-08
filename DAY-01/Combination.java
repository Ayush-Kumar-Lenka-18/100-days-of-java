//nCr=n!/r!(n-r)!
import java.util.Scanner;

public class Combination{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Valur of n");
        int n=sc.nextInt();
        System.out.println("Enter Valur of r");
        int r=sc.nextInt();
        int numerator=1;
        int denominator=1;
        int Rfact=1;
        for(int i=n;i>0;i--){
            numerator=numerator*i;
        }
        for(int i=r;i>0;i--){
            Rfact=Rfact*i;
        }
        for(int i=n-r;i>0;i--){
            denominator=denominator*i;
        }
        System.out.print("The value of nCr:"+numerator/(Rfact*denominator));


    }
}

import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the no.");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        for(int i=n;i>0;i--){
            fact=fact*i;
        }
        System.out.println("tHE FACTORIAL OF "+n+" IS "+fact);
    }
}

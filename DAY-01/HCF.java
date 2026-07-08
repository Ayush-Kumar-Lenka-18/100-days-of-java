import java.util.*;

public class HCF {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st no.:");
        int n1=sc.nextInt();
        System.out.println("Enter the 2nd no.:");
        int n2=sc.nextInt();
        int low=n1>n2?n2:n1;
        int hcf=1;
        for(int i=1;i<=low;i++){
            if(n1%i==0 && n2%i==0){
                hcf=i;
            }
        }
        System.out.println("The HCF is:"+hcf);
    }
}

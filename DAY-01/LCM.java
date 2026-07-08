import java.util.*;
public class LCM {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a First  number:");
        int n1=sc.nextInt();
        System.out.println("Enter a second  number:");
        int n2=sc.nextInt();
        int lcm=n1>n2?n1:n2;
        while (true) {

            if(lcm%n1==0 && lcm%n2==0){
                break;
            }
            lcm++;
        }
        System.out.println("LCM = "+lcm);

    }
}

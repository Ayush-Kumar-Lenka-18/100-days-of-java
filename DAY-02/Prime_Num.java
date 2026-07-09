import java.util.*;
public class Prime_Num {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The given no is prime:"+isPrime(n));

    }
    static boolean isPrime(int n){
        int count=0;
        if(n<=1)return false;
        for(int i=2;i<=n;i++){
                if(n%i==0){
                    count++;
                }
            }
        if(count>1){
            return false;
        }
        else {
            return true;
        }
    }
}

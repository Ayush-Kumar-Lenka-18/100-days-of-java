import java.util.*;
public class prime {
    public static void main(String[] args) {
        System.out.println("Enter two number:");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        for(int i=n1;i<=n2;i++){
            if(isPrime(i)){
                System.out.println(i+" is a prime number");
            }
        }
    }
    static Boolean isPrime(int n){
        int count=0;
        if(n<=1)return false;
        for(int j=2;j<=n;j++){
                if(n%j==0){
                    count++;
                }
            }
        if(count>1){
            return false ;
        }
        else{
            return true;
        }
        }

}

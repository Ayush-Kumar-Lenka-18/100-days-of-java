import java.util.*;
public class Natural_No {
    public static void main(String[] args) {
        System.out.println("Enter the No.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printer(n);
    }

    static void printer(int n) {
        if (n<1)return;
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);

    }
}

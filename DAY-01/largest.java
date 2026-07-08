import java.util.*;
public class largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int largest=0;
        while(true){
            System.out.print("Enter  integers: ");
            int n=sc.nextInt();
            if(n>largest){
               largest=n;
            }
            if(n==0)break;
        }
        System.out.println("The largest integer is: "+largest);
    }
}

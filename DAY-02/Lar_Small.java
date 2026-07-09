import java.util.*;
public class Lar_Small {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        System.out.println("The largest number is "+largest(n1,n2,n3));
        System.out.println("The smallest number is "+smallest(n1,n2,n3));
    }
    static int largest(int n1, int n2, int n3) {
        int largest=n1;
        if(n2>n1&&n2>n3){
            largest=n2;
        }
        else if(n3>n1&&n3>n2){
            largest=n3;
        }
        return largest;
        }
    static int smallest(int n1, int n2, int n3) {
        int smallest=n1;
        if(n2<n1&&n2<n3){
            smallest=n2;
        }
        else if(n3<n1&&n3<n2){
            smallest=n2;
        }
        return smallest;
        }
    }


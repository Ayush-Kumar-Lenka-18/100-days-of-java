import java.util.*;
public class Sum_Fun {
    public static void main(String[] args) {
        Sum();
        System.out.println(sum(23,56));
        System.out.println(greet("AYUSH"));
    }


        static void Sum(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int n1=sc.nextInt();
            System.out.println("Enter a number");
            int n2=sc.nextInt();
            int Sum=n1+n2;
            System.out.println("The sum is"+Sum);
        }
        static int sum(int a,int b){
        return a+b;
        }
        static String greet(String name){
        return "hello "+name;
        }
    }


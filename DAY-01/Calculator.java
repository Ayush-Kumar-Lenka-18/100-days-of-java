import java.util.*;
public class Calculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("Enter Operator: ");
            char op=sc.next().trim().charAt(0);
            if(op=='+' || op=='-' || op=='*' || op=='/' || op=='%'||op=='x'){
                int num1=sc.nextInt();
                int num2=sc.nextInt();
                if(op=='+'){
                    System.out.println(num1+num2);
                }
                if(op=='-'){
                    System.out.println(num1-num2);
                }
                if(op=='*'){
                    System.out.println(num1*num2);
                }
                if(op=='/'){
                    System.out.println(num1/num2);
                }
                if(op=='x'){
                    break;
                }
            }
        }
    }
}

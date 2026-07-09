import java.util.Scanner;
public class Switch_Case{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any fruit name");
        String fruit=input.nextLine();
        switch(fruit){
            case "Mango":
                System.out.println("Mango");
                break;
            case "Orange":
                System.out.println("Orange");
                break;
            case "Apple":
                System.out.println("Apple");
                break;
            default:
                System.out.println("Not a valid fruit");
        }
    }
}
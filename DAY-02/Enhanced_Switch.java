import java.util.*;
public class Enhanced_Switch {
    public static void main(String[] args) {
        System.out.println("Enter a fruit");
        Scanner input = new Scanner(System.in);
        String fruit = input.nextLine();
        switch(fruit){
            case "Mango"->System.out.println("Mango");
            case "Orange"->System.out.println("Orange");
            default ->System.out.println("Enter a valid  fruit");
        }

        //break advantage
        System.out.println("Enter a week days bet 1-7");
        int weekdays = input.nextInt();
        switch(weekdays){
            case 1,2,3,4,5->System.out.println("weekdays");
            case 6,7->System.out.println("weekends");
        }
    }
}

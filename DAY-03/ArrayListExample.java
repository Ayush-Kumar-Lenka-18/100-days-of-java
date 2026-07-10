import java.util.ArrayList;
import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<Integer>(10);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        System.out.println(arr);
        System.out.println(arr.contains(1));
        arr.set(0,99);
        System.out.println(arr);
        arr.remove(0);
        System.out.println(arr);

        //input
        for(int i=0;i<5;i++){
            arr.add(sc.nextInt());
        }
        System.out.println(arr);
        //output in loop
        for(int i=0;i<5;i++){
            System.out.println(arr.get(i));
        }

    }
}

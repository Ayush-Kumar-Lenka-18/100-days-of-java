import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //array syntax:-datatype[] variable_name=new datatype[size];and datatype [] var_name={.....}
        //array for primitive
//        int[] arr=new int[4];
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the array elements:");
//        for(int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
//        for(int num:arr){
//            System.out.println(num+" ");
//        }
//        System.out.println(Arrays.toString(arr));
        //array for objects or non-primitive
        String[] arr1=new String[3];
        for(int i=0;i<arr1.length;i++){
            System.out.println("Enter element of array:");
            arr1[i]=sc.next();
        }
        System.out.println(Arrays.toString(arr1));
    }
}
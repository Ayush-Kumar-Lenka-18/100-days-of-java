import java.util.*;
public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] arr=new int[3][2];
        int[][] arr1={{1,2,3},{4,5,6},{7,8,9}};
        Scanner sc=new Scanner(System.in);
        //INPUT
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print("Enter row "+row+" col "+col+": ");
                arr[row][col]=sc.nextInt();
            }
        }
        //output:-
//        for(int row=0;row<arr.length;row++){
//            for(int col=0;col<arr[row].length;col++){
//                System.out.println("The array element at row "+row+" and col "+col+": "+arr[row][col]);
//            }
//        }
//        for(int row=0;row<arr.length;row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }
        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }

        


    }
}

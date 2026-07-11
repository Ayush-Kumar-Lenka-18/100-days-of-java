import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args){
        int[] arr={45,6,8,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.println("The no."+n+"found at index:"+test(arr,n));

    }
    static int test(int[]arr,int n){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return i;
            }
        }
        return -1;
    }
}

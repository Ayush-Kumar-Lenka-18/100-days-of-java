import java.util.Arrays;

public class MAX {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,6};
        System.out.println("The maximum value of arr is: "+Maximizer(arr));
    }
    static int Maximizer(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}

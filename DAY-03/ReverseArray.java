import java.util.Arrays;

public class ReverseArray {
    public static  void main(String[] args){
        int[] arr={1,3,4,5,6};
        int start=0;
        int end=arr.length-1;
        System.out.println(Arrays.toString(arr));
        swap(arr,start,end);
        System.out.println("Reversed array is: "+Arrays.toString(arr));
    }
    static  void swap(int[] arr,int start,int end){
        while(start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

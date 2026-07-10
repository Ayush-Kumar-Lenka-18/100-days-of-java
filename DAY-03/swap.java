import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        int index1=1;
        int index2=3;
        swapper(arr,index1,index2);
        System.out.println(Arrays.toString(arr));
    }
    static void  swapper(int[] arr,int index1,int index2){
        int temp=arr[1];
        arr[1]=arr[3];
        arr[3]=temp;
    }
}

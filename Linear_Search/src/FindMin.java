public class FindMin {
    public static void main(String[] args) {
        int [] arr={22,4,6,7};
        System.out.println(LinearSearch(arr));
    }
    static int LinearSearch(int[] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}

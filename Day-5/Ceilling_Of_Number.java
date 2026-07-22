public class Ceilling_Of_Number {
    public static void main(String[] args) {
        int[] arr={2,3,4,7,8,10};
        int target=5;
        boolean isAsc=isAscending(arr);
        int ans=binarySearch(arr,target,isAsc);
        System.out.println(ans);

    }
    static boolean isAscending(int[] arr){
        if(arr==null||arr.length==0){
            return false;
        }
        if(arr[0]>arr[arr.length-1]){
            return false;
        }
        else{
            return true;
        }
    }
    static int binarySearch(int[] arr,int target,boolean isAsc) {
        int start = 0;
        int end =arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            }
            if (isAsc) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        if(start<arr.length){
            return arr[start];
        }
        return -1;
    }
}

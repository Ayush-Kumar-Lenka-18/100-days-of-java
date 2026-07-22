public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,8,7,6,5,4,3,2,1};
        int target=7;
        boolean isAsc=isAscending(arr);
        int ans=binarysearch(arr,target,isAsc);
        System.out.println(ans);
    }
    static boolean isAscending(int[] arr) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        else if(arr[0]<arr[arr.length-1]) {
            return true;
        }
        else{
            return false;
        }
    }
    static int binarysearch(int[] arr,int target,boolean isAsc){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                }
            } else{
                if(arr[mid]>target){
                    start=mid+1;
                }
                else if(arr[mid]<target){
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
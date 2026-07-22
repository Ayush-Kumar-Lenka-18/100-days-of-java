public class InfiniteArray {
    public static void main(String[] args) {
        int[]arr={2,4,6,10,12,23,34,46,56};
        int target=23;
        int answer=ans(arr,target);
        System.out.println(answer);
    }
    static int ans(int[] arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]) {
            int newStart = end + 1;
            end = end+(end - start + 1)*2;
            start = newStart;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}

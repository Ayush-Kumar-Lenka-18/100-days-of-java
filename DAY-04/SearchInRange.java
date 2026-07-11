public class SearchInRange {
    public static void main(String[] args) {
        int[]arr={12,54,67,98,56,34};
        int start=1;
        int end=4;
        int n=67;
        System.out.println(LinearSearch(arr,n,start,end));

    }
    static int LinearSearch(int[]arr,int n,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for(int i=start;i<=end;i++){
            if(arr[i]==n){
                return i;
            }
        }
        return -1;
    }
}

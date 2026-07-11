import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr={{43,2,3},{6,7,4},{23,9,78}};
        int target=4;
        System.out.println("The no. found at index:"+ Arrays.toString(searching(arr, target)));
        System.out.println("The max  no. found is:"+ max(arr));
    }
    static  int[] searching(int[][] arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1} ;
    }
    static  int max(int[][] arr){
        int max=Integer.MIN_VALUE;
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]>max){
                    max=arr[row][col];
                }
            }
        }
        return max;
    }
}

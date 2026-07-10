import java.util.Arrays;
public class PassingInFunction {
    public static void main(String[] args) {
        int[] var={23,2,3,4};
        System.out.println(Arrays.toString(var));
        parser(var);
        System.out.println(Arrays.toString(var));
    }
    static void parser(int[] arr){
        arr[0]=9;
    }
}

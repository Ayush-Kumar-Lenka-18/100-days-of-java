import java.util.Arrays;
public class SearchInString {
    public static void main(String[] args) {
        String str = "abcdefg";
        char target='j';
        System.out.println("The given char is present in string:"+searchInString2(str,target));
        System.out.println(Arrays.toString(str.toCharArray()));
    }
    static boolean searchInString2(String str, char target){
        if(str.isEmpty()){
            return false;
        }
        for(char ch:str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }

    static boolean searchInString(String str, char target){
        if(str.isEmpty()){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
}

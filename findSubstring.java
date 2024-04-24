import java.util.*;

public class findSubstring {

    public static String subString(String str, int si,int ei){
        String substr = "";
        for(int i = si; i <= ei - 1; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
        String str = "helloWorld";
        System.out.println(str.substring (0, 5));
        System.out.println(subString(str,4,7));
    }
}

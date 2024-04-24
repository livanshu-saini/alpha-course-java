import java.util.*;

public class reverseString {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String newstr = "";

        for(int i = 0; i <= str.length() - 1; i++){
            newstr = str.charAt(i) + newstr;
        }
        System.out.println(newstr);

    }


}

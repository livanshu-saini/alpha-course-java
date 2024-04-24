import java.util.*;

public class strings {

    public static void printLetters(String str){
        for(int i = 0; i<str.length(); i++){
            System.out.println(str.charAt(i));
        }
    }

    public static void main(String args[]){
        char arr[] = {'a','b','c','d'};
        String str = "abcd";
        String str2 = new String("xyz");
        System.out.println(str);
        System.out.println(str2);

        // Strings are IMMUTABLE

        String name;
        Scanner sc = new Scanner(System.in);
        // next() take input of a single word whereas nextLine() take input of a whole sentence

        // name = sc.nextLine();
        // System.out.println(name);

        // String fullName = "Tony stark";
        // System.out.println(fullName.length());

        //concatenation
        String firstName = "Livanshu";
        String lastName = "Saini";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        System.out.println(firstName.charAt(0));
        printLetters(fullName);


    }
    
}

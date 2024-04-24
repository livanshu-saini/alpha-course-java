import java.util.*;

public class largestString {
    public static void main(String args[]){
        String fruits[] = {"apple", "banana", "mango"};
        String largest = fruits[0];

        //compareTo compares strings alphabetically
        //compareToIgnoreCase compares strings alphabetically with lowercase or uppercase consideration
        for(int i = 0; i <= fruits.length - 1; i++){
            if(largest.compareToIgnoreCase(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}

import java.util.*;

public class arraylistSize {
    public static void main(String args[]){

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list.size());

        //printing ArrayList
        for(int i = 0; i < list.size(); i++){
            int element = list.get(i);
            System.out.println(element);
        }
    }
}

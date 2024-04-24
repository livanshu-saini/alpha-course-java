import java.util.*;

public class arraylistSort {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        //ascending order
        Collections.sort(list);
        System.out.println(list);

        //decensing order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

    }
}

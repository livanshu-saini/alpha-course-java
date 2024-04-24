import java.util.*;

public class arraylist {
    public static void main(String args[]){

        //java collection framework
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        //add operation
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(1,9);
        System.out.println(list);

        //get operation
        int element = list.get(3);
        System.out.println(element);

        //delete or remove operation
        list.remove(2);
        System.out.println(list);

        //set operation
        list.set(2, 10);
        System.out.println(list);

        // contains operation
        System.out.println(list.contains(1));
        System.out.println(list.contains(22));


        
    }
}

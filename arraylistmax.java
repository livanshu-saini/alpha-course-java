import java.util.*;

public class arraylistmax {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(23);
        list.add(33);
        list.add(4);
        list.add(5);
        
        
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < list.size(); i++){
            if(max < list.get(i)){
                max = list.get(i);
                // max = Math.max (max, list.get (i));
            }
        }
        System.out.println("max element = " + max);
    }
}

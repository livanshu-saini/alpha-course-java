import java.util.*;

public class shortestPath {

    public static float getShortestPath(String str){
        int x = 0;
        int y = 0;
        for(int i = 0; i <= str.length() - 1; i++){
            char dir = str.charAt(i);
            if(dir == 'N'){
                y++;
            }
            else if(dir == 'S'){
                y--;
            }
            else if(dir == 'E'){
                x++;
            }
            else if(dir == 'W'){
                x--;
            }
        }

        int x2 = x * x;
        int y2 = y * y;
        return (float)Math.sqrt(x2 + y2);
    }
    
    public static void main(String args[]){
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }

}

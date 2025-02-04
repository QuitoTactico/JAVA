import java.util.ArrayList;

public class Snail {

    public static int[] snail(int[][] array) {
        ArrayList<Integer> res = new ArrayList<Integer>(); 
        
        return res.stream().mapToInt(Integer::intValue).toArray();
    } 
}
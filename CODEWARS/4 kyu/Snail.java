import java.util.ArrayList;
import java.util.Arrays;

// Snail

public class Snail {
    public static void main(String[] args) {
        int[][] array = {{1,2,3}, {4,5,6}, {7,8,9}};

        int[] res = snail(array);
        for (int i : res) {
            System.out.printf("%d, ", i);
        }
        System.out.println();




        int[][] array2 = {
            {716, 603, 483, 731, 963, 331, 327, 613, 459, 561, 755, 725, 140, 195},
            {51, 570, 954, 406, 300, 650, 622, 555, 19, 629, 415, 777, 504, 971},
            {995, 421, 332, 212, 354, 996, 287, 653, 988, 321, 108, 721, 982, 304},
            {120, 443, 40, 111, 34, 779, 997, 397, 697, 31, 949, 220, 422, 986},
            {300, 454, 646, 466, 615, 986, 42, 984, 119, 304, 75, 669, 846, 17},
            {861, 91, 32, 506, 580, 794, 559, 189, 191, 487, 286, 700, 863, 34},
            {944, 164, 799, 700, 808, 874, 406, 398, 347, 348, 244, 785, 232, 225},
            {886, 242, 819, 277, 551, 147, 733, 755, 259, 433, 488, 334, 626, 445},
            {445, 860, 929, 560, 231, 801, 692, 583, 396, 808, 835, 643, 777, 447},
            {991, 866, 323, 570, 584, 441, 75, 956, 500, 254, 6, 82, 338, 512},
            {972, 466, 373, 872, 262, 989, 430, 971, 424, 108, 579, 114, 815, 121},
            {52, 510, 289, 621, 152, 868, 831, 447, 545, 910, 857, 851, 862, 240},
            {950, 90, 714, 139, 568, 1, 868, 130, 5, 908, 325, 438, 495, 538},
            {944, 84, 452, 395, 549, 294, 622, 427, 525, 146, 670, 282, 469, 790}
        };

        int[] res2_beta = {716, 603, 483, 731, 963, 331, 327, 613, 459, 561, 755, 725, 140, 195, 971, 304, 986, 17, 34, 225, 445, 447, 512, 121, 240, 538, 790, 469, 282, 670, 146, 525, 427, 622, 294, 549, 395, 452, 84, 944, 950, 52, 972, 991, 445, 886, 944, 861, 300, 120, 995, 51, 570, 954, 406, 300, 650, 622, 555, 19, 629, 415, 777, 504, 982, 422, 846, 863, 232, 626, 777, 338, 815, 862, 495, 438, 325, 908, 5, 130, 868, 1, 568, 139, 714, 90, 510, 466, 866, 860, 242, 164, 91, 454, 443, 421, 332, 212, 354, 996, 287, 653, 988, 321, 108, 721, 220, 669, 700, 785, 334, 643, 82, 114, 851, 857, 910, 545, 447, 831, 868, 152, 621, 289, 373, 323, 929, 819, 799, 32, 646, 40, 111, 34, 779, 997, 397, 697, 31, 949, 75, 286, 244, 488, 835, 6, 579, 108, 424, 971, 430, 989, 262, 872, 570, 560, 277, 700, 506, 466, 615, 986, 42, 984, 119, 304, 487, 348, 433, 808, 254, 500, 956, 75, 441, 584, 231, 551, 808, 580, 794, 559, 189, 191, 347, 259, 396, 583, 692, 801, 147, 874, 406, 398, 755, 733};

        boolean tabien = true;
        int[] res2 = snail(array2);
        for (int i = 0; i<res2.length; i++) {
            if(res2[i] != res2_beta[i]){
                tabien = false;
                break;
            }
        }
        String nose = (tabien) ? "bien":"mal";
        System.out.println(nose);
       
    }

    public static int[] snail(int[][] array) {
        ArrayList<Integer> res = new ArrayList<Integer>(); 

        int max_y = array.length;
        int max_x = array[0].length;

        for(int inner = 0; inner < (int)Math.min(max_y, max_x)/2; inner++){
            //up
            for(int x = inner; x < max_x - inner; x++){
                //System.err.println(array[inner][x]);
                res.add(array[inner][x]);
            }

            //right
            for(int y = inner+1; y < max_y - inner - 1; y++){
                //System.out.println(array[y][max_x-inner-1]);
                res.add(array[y][max_x-inner-1]);
            }

            //down
            for(int x = max_x - inner - 1; x >= inner; x--){
                //System.err.println(array[max_y - inner - 1][x]);
                res.add(array[max_y - inner - 1][x]);
            }
            
            //left
            for(int y = max_y - inner - 2 ; y >= inner+1; y--){
                //System.out.println(array[y][max_x-inner-1]);
                res.add(array[y][inner]);
            }

            //System.out.println();
        }

        // un-even rectangle
        if(Math.min(max_y, max_x)%2 != 0){
            // wiiide (or cubic)
            if(max_x>=max_y){
                int middle = ((int) max_y/2); 
                for(int x = middle; x < max_x - middle; x++){
                    //System.out.println(array[middle][x]);
                    res.add(array[middle][x]);
                }
            }
            // taaaall
            else{
                
                int middle = ((int) max_x/2); 
                for(int y = middle; y < max_y - middle; y++){
                    res.add(array[y][middle]);
                }

            }
        }
        
        return res.stream().mapToInt(Integer::intValue).toArray();
    } 
}



/*
 * Much better...
 * 
 * public class Snail {

    public static int[] snail(int[][] array) {
      if (array[0].length == 0) return new int[0];
      int n = array.length;
      int[] answer = new int[n*n];
      int index=0;
      for (int i = 0; i<n/2; i++){
        for (int j = i; j < n-i; j++) answer[index++] = array[i][j];
        for (int j = i+1; j < n-i; j++) answer[index++] = array[j][n-i-1];
        for (int j = i+1; j < n-i; j++) answer[index++] = array[n-i-1][n-j-1];
        for (int j = i+1; j < n-i-1; j++) answer[index++] = array[n-j-1][i];
      }
      if (n%2 != 0) answer[index++] = array[n/2][n/2];
      return answer;
    } 
}
 */
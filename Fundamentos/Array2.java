
public class Array2
{
    public static int minimoBuscado(int[][] arr){
        int min = arr[0][0];
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                if (min > arr[i][j]){
                    min = arr[i][j];
                }
            }
        }
        return min;
    }
    public static int sumaDiagonal(int[][] arr){
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                if (i==j){
                    sum = sum + arr[i][j];
                }
            }
        }
        return sum;
    }
    //misma clase de nuevo jajja
    public static void transpuesta(int[][] arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                System.out.println(arr[j][i]);
            }
        }
    }
}

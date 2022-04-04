
public class PARCIAL2
{
    int[][] matrizAtrib = {{1,2,3},{4,5,6}};
    //¿para qué la matriz atributo?, supongo que
    //era para que recordáramos cómo se declaraban, ¿no?
    public static int[] sumaColumnas(int[][] matriz){
        int[] arr = new int[matriz[0].length];
        for(int i = 0 ; i < matriz.length ; i++){
            for(int j = 0 ; j < matriz[i].length ; j++){
                arr[j] = arr[j] + matriz[i][j];
            }
        }
        return arr;
    }
    public static int sumaMultiplosCinco(int[] arr){
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if((arr[i] % 5) == 0){
                sum = sum + arr[i];
            }
        }
        return sum;
    }
    public static int elementoMayor(int[] arr){
        int may = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            if (may < arr[i]){
                    may = arr[i];
                }
        }
        return may;
    }
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

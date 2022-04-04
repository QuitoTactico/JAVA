

public class Balanceado
{
    public static boolean balancear(int[] a){
        boolean bool = false;
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < (a.length/ 2) ; i++){
             sum1 = sum1 + a[i];
        }
        for(int i = 0; i < (a.length/ 2) ; i++){
            sum2 = sum2 + a[(a.length - i - 1)];
        }
        if(sum1 == sum2){
            bool = true;
        }
        return bool;
    }
}



public class decisionCiclo1
{
    public static int desicionCiclo1(int m, int n){
        int sum = 0;
        for(int i = m; i <= n ; i++){
            if(i%2 == 0){
                sum = sum + i;
            }
        }
        return sum;
    }
}

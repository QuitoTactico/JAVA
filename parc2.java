
public class parc2
{
    int result = 0;
    /*
    mi método2*/
    public static int cuantos6(int n){
        if(n > 10){
            if((n%10) == 6){ 
                return (cuantos6(n/10) + 1);
            }else{
                return cuantos6(n/10);
            }
        }else{
            if(n==6){
                return 1;
            }else{
                return 0;
            }
        }
    }
}

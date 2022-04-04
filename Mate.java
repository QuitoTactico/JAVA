

public class Mate
{
    public int factorial(int num){
        int facto = 1;
        for(int i = 1 ; i <= num ; i++){
            facto = facto * i;
        }
        return facto;
    }
}

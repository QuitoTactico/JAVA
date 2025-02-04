
import java.util.ArrayList;
public class Repetidos
{
    public static int detectorDeRepetidos(ArrayList<Integer>a){
        int cont = 0;
        for(int i = 0; i < (a.size()-1); i++){
            if(a.get(i) == a.get(i+1)){ 
                 cont++;
            }
        }
        for(int i = 0; i < (a.size()-2); i++){
            if(a.get(i) == a.get(i+2)){
                 cont--;
            }
        }
        /*fué una locura hacer éste, de seguro
         * hay una forma más fácil, pero bueno
         */
        return cont;
    }    
}

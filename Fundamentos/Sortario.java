

public class Sortario
{
    public static boolean detectorDeMalaSuerte(int[] a){
        int l = a.length;
        boolean bool = false;
        int cont1 = 0;
        int cont2 = 0;
        for(int i = 0; i < l; i++){
            if(a[i] == 1 || a[i] == 3){
                cont1 ++;
            }else if(a[i] == 13){
                cont2 ++;
            }
        }
        if(cont1 > 1 || cont2 > 0){
            bool = true;
        }
        
        return bool;
    }
}

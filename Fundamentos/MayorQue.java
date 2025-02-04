

public class MayorQue
{
    public static void mayor(int[] a){
        int l = a.length;
        int cont = 0;
        int prim = a[0];
        for(int i = 1; i < l; i++){
            if(a[i] > prim){
                System.out.println(a[i]);
                cont++;
            }
        }
        if(cont == 0){
            System.out.println("No hay ningun numero mayor que el primero");
        }
    }
}

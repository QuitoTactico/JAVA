
public class Array
{
    public static void recorrerArray(int[] n, int indice){
        if(indice == n.length-1){
            System.out.println(n[indice]);
        }else{
            System.out.println(n[indice]);
            recorrerArray(n , indice + 1);
        }
    }
}

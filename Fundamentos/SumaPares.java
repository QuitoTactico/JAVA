
import java.util.Scanner;
public class SumaPares
{
   public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       int num = scan.nextInt();
       int suma = 0;
       for(int i = 0 ; i < num ; i++){
           int actu = scan.nextInt();
           if(actu%2 == 0){
               suma += actu;
           }else{
               continue;
           }
       }
       System.out.println(suma);
   }
}

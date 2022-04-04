
import java.util.Scanner;
public class Estrellas
{
   public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       int tot = 0;
       int num = 0;
       
       int cer = 0;
       int uno = 0;
       int dos = 0;
       int tre = 0;
       int cua = 0;
       int cin = 0;
       for(int i = 0 ; num >= 0 ; tot++){
           num = scan.nextInt();
           switch(num){
               case 0:
               cer++;
               break;
               case 1:
               uno++;
               break;
               case 2:
                   dos++;
                   break;
                   case 3:
                   tre++;
                   break;
                   case 4:
                   cua++;
                   break;
                   case 5:
                   cin++;
                   break;
           }
       }
       System.out.println("0("+cer+") *("+uno+") **("+dos+") ***("+tre+") ****("+cua+") *****("+cin+")");
       int totfin = tot - 1;
       System.out.println("Total: "+totfin);
   }
}

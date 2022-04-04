
import java.util.Scanner;
public class Infinito
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(true){ 
            int a = scan.nextInt();
            if(a != 0){
                System.out.println((a*3));
            }else{
                break;
            }
            /*Había una forma más simple de hacerlo
             * Simplemente era inicializar "a" desde antes,
             * poner while(a != 0){print((a*3));}
             * el if estaría integrado de por sí xd
             * pero bueno, había que poner el break;...
             */
            
        }
    }
}

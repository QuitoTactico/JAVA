
/**
 * Vaina con Scanner, cómo es la estructura, cómo se hace
 */
import java.util.Scanner;

public class EstructuraScan
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        /*(decir de qué tipo son) declarar atributos, o, bueno, las variables 
         * = y esas variables qué significan?
         */
       
        String sujeto = entrada.nextLine();
        String verbo = entrada.nextLine();
        String predicado = entrada.nextLine();
        int numeroCualquiera = entrada.nextInt();
       
        //imprimir vaina
       
        System.out.println(sujeto+" "+ verbo+" " + predicado +", ey, pongamos números cualquiera porque sí, mire este: "+ numeroCualquiera);
    }
}

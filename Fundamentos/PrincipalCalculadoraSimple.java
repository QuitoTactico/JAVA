import java.util.Scanner;
public class PrincipalCalculadoraSimple
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        CalculadoraSimple operar = new CalculadoraSimple(); 
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int suma = operar.sumar(a,b);
        int resta = operar.restar(a,b);
        
        System.out.println(suma);
        System.out.println(resta);
    }
}

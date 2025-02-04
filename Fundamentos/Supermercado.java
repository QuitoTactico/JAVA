import java.util.Scanner;
public class Supermercado
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int tipo = scan.nextInt();
        int cant = scan.nextInt();
        int punt1 = cant * 5;
        switch(tipo){
            case 1:
                System.out.println(punt1);
                break;
            
            case 2:
                System.out.println(punt1 * 2);
                break;
                
            default:
                System.out.println(punt1 * 3);
        }
    }
}

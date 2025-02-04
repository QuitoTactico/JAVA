
import java.util.Scanner;
public class SubTexto
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String texto1 = scan.nextLine();
        int inicio = scan.nextInt();
        int fin = scan.nextInt();
        
        System.out.println(texto1.substring(inicio, (fin +1)));
    }
}

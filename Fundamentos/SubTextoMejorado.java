
import java.util.Scanner;
public class SubTextoMejorado
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String texto1 = scan.nextLine();
        int inicio = scan.nextInt();
        int fin = scan.nextInt();
        int largo = texto1.length();
        
        if(fin > largo){
            System.out.print("Error");
        }else if(inicio > fin){
            System.out.print("Error2");
        }else{
            System.out.println(texto1.substring(inicio, (fin +1)));
        }
    }
}


import java.util.Scanner;
public class Conteo100
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int cont = 0;
        while(true){
            int num = scan.nextInt();
            if(num > 100){
                cont++;
            }else if(num == 0){
                System.out.println(cont);
                break;
            }
        }
    }
}
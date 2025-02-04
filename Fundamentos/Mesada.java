
import java.util.Scanner;
public class Mesada
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        while(true){
            int a = scan.nextInt();
            if(a > 500){
                System.out.println(name + " eres mi angel");
                break;
            }else{
                System.out.println(name + " me decepcionas");
                continue;
            }
        }
    }
}

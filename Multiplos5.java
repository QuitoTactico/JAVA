
import java.util.Scanner;
public class Multiplos5
{
     public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     int num = scan.nextInt();
     for(int i = 5 ; i <= num ; i = i + 5){
         System.out.println(i);
     }
     }
}

import java.util.Scanner;
public class Helado2
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int temp = scan.nextInt();
        int edad = scan.nextInt();
        
        if(temp > 27 && edad >= 18){
            System.out.println("Comprar helado cerveza");
        }else{
            System.out.println("Lo sentimos juventud");
        }
    }
}

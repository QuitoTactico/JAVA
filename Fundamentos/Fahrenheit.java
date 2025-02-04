import java.util.Scanner;
public class Fahrenheit
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int celsius = scan.nextInt();
        double fah = (1.8*celsius+32);
        String.format("%.2f", fah);
        
        System.out.println(String.format("%.2f", fah));
    }
}
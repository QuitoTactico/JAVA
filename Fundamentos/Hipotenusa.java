import java.util.Scanner;
public class Hipotenusa
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        double a = scan.nextInt();
        double b = scan.nextInt();
        double hip = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        
        String.format("%.2f", hip);
        
        System.out.println(String.format("%.2f", hip));
    }
}

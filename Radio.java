import java.util.Scanner;
public class Radio
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        double r = scan.nextInt();
        double a = Math.PI*Math.pow(r,2);
        
        String.format("%.2f", a);
        
        System.out.println(String.format("%.2f", a));
    }
}

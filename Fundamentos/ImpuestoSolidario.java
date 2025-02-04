import java.util.Scanner;
public class ImpuestoSolidario
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        double sal = scan.nextDouble();
        String contrato = scan.next();
        
        if(contrato.equals("publico") && sal > 10000000){
            System.out.println(String.format("%.2f", sal * 0.15));
        }else{
            System.out.println("No debes aportar");
        }
    }
}

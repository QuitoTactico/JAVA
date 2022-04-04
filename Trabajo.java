import java.util.Scanner;
public class Trabajo
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int dia = scan.nextInt();
        double salario = scan.nextDouble();
        
        switch(dia){
            case 1:
                salario = salario * 1.455;
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                salario = salario * 1.1;
                break;
            case 5:
                salario = salario * 1.295;
                break;
            default:
                salario = salario * 1.75;
                break;
        }
        
        System.out.println(String.format("%.2f", salario));
    }
}

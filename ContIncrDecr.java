import java.util.Scanner;
public class ContIncrDecr
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double num = 0.0;
        int cont = 0;
        int sapoperropallenar = 10;
        System.out.println("+1");
        for(double comparar = scan.nextDouble(); comparar != 0 ; sapoperropallenar-- ){
            comparar = scan.nextDouble();
            if(comparar == 0){
                break;
            }else if(comparar >= num){
                System.out.println("+1");
                cont++;
            }else{
                System.out.println("-1");
                cont--;
            }
            num = comparar;
        }
        cont++;
        System.out.println("Contador: "+cont);
    }
}

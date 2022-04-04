import java.util.Scanner;
public class SensoresCaptura 
{
    //CPS = Captado Por los Sensores
    public static double LuzCPS;
    public static double SonidoCPS;
    public static Scanner scan = new Scanner(System.in);
    /*Ejemplo dado para ingresar los parámetros que los
      sensores captarían y transmitirían*/
    static public void CapturarCondiciones(){
        System.out.println("Inserte luz de ambiente");
        LuzCPS = scan.nextDouble();
        System.out.println("Inserte sonido de ambiente");
        SonidoCPS = scan.nextDouble();
    }
    static public double GetLuzCPS(){
        return LuzCPS;
    }
    static public double GetSonidoCPS(){
        return SonidoCPS;
    }
}

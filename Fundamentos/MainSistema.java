
public class MainSistema
{
    //Sistema apagado por defecto para ahorrar batería del arduino.
    public static boolean encendidoApagado = false;//true=On,false=Off
    /*Valores óptimos máximos tomados como referencia
      Pueden cambiar de acuerdo a próximas pruebas*/
    public static final double MAXSONIDO = 40;//Expresado en decibeles
    public static final double MAXLUZ = 3000;//Expresado en lúmenes
    /*método para que un botón encienda y apague el sistema. 
      los requisitos para mantenerlo en funcionamiento 
      y procesamiento constante son demasiados.
      El String resultante del método es para ejemplificar lo que sucede*/
    public static String BotonDeEncendido(){
        if(encendidoApagado == false){
            encendidoApagado = true;
            return "El sistema está encendido, podemos revisar.";
        }else{
            encendidoApagado = false;
            return "Apagaste el sistema, hazlo luego de haber revisado.";
        }
    }
    /*CPS = Siglas para "Captado Por el Sensor".
      Éste es el código que va en el arduino. Cada que se use el
      método, los sensores mandarán automáticamente los datos que
      estén recibiendo. Sin iteraciones, solo lo de ese instante.
      Éste es el módulo de procesamiento*/
    public static void RevisarOptimidad(){
        //Comparacion entre los datos recibidos con los óptimos.
        int result = 0;
        if(encendidoApagado == true){
            SensoresCaptura.CapturarCondiciones();
            double sonidoCPS = SensoresCaptura.GetSonidoCPS();
            double luzCPS = SensoresCaptura.GetLuzCPS();
            /*Si los recibidos están por debajo del máximo permitido, un
              contador aumenta, que luego se traduce a colores en led*/
              if(luzCPS < MAXLUZ){
                result++;
            }
            if(sonidoCPS <  MAXSONIDO){
                result++;
            }
            //Valores que retornaría por medio de leds al final
        }else{
            /*Claramente si el sistema está apagado, no va a retornar nada,
              pero es para que compile y se entienda la verificación.*/
            result = -1;
        }
        System.out.println(LedsVisualizacion.EncenderLed(result));
        System.out.println(LedsVisualizacion.LoQueDebeHacerElUsuario(result));
    }
}

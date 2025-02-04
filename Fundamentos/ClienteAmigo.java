

public class ClienteAmigo
{
    static Amigo[] arregloAmigos = new Amigo[10];
    static int contadorAmigos = 0;
    public static void agregarAmigo(Amigo amigo){
        if(contadorAmigos < 10){
            arregloAmigos[contadorAmigos]= amigo;
            contadorAmigos++;
        }
    }
    public static void elMasAlto(){
        Amigo mayor = arregloAmigos[0];
        for(int i = 0; i < contadorAmigos-1; i++){
            //lo puse con contadorAmigos en vez de length
            //para que se pueda usar aún si no se han llenado
            //las 10 posiciones con amigos
            if((arregloAmigos[i].Estatura)> mayor.Estatura){
                mayor = arregloAmigos[i];
            }
        }
        System.out.println(mayor.Nombre);
    }
}

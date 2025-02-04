import java.util.Scanner;
public class PrincipalJugador
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Jugador jug = new Jugador();
        
        int salud = scan.nextInt();
        jug.setSalud(salud);
        
        String nombre = scan.next();
        jug.setNombre(nombre);
        
        int num = scan.nextInt();
        jug.reducirSalud(num);
        
        int num2 = scan.nextInt();
        jug.reducirSalud(num2);
          
        System.out.println(jug.getNombre() + jug.getSalud()); 
    }
}


import java.util.Scanner;
public class WithoutString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String base = scan.nextLine();
        String eliminar = scan.nextLine();
        /* Hoy me puse a buscar el resto de métodos
         * importantes para strings, y estoy seguro de que
         * habría sido genial que nos enseñaran éste.
         */
        System.out.println(base.replaceAll(eliminar, ""));
    }
}

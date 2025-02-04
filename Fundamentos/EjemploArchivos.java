import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;

public class EjemploArchivos
{
    public void leerArchivo(String nombre) throws FileNotFoundException {
        File archivo = new File(nombre);
        Scanner in = new Scanner(archivo);
        while(in.hasNextLine()) {
            String linea = in.nextLine();
            Scanner scannerLinea = new Scanner(linea);
            scannerLinea.useDelimiter(",");
            String usuario = scannerLinea.next();
            String clave = scannerLinea.next();
            String nombreCompleto = scannerLinea.next();
            System.out.println(usuario + " " + clave + " " + nombreCompleto);
        }
        in.close();
    }
    
    public void agregarUsuario(String nombre, String u, String c, String nC)
        throws FileNotFoundException, IOException {
        File archivo = new File(nombre);
        PrintWriter out = new PrintWriter(new FileWriter(archivo, true));
        out.println(u + "," + c + "," + nC);
        out.close();
    }
}

import java.util.*;
//import java.io.*;
 
import java.io.File; //Crea, elimina, y ve propiedades de archivos
import java.io.FileWriter; //bro, ps pa escribir q no ves. Constructor con true
import java.io.PrintWriter; //La misma wea pero espaciada, el de arriba era auxiliar
//Matryoshka  pw pwName = new pw (new fw(arch, true))
import java.io.FileNotFoundException; //mamadas para ahorrarme el poner try-catch
import java.io.IOException;
public class Archivos
{
    static Scanner scan = new Scanner(System.in);
    public static void CrearArchivo() throws IOException {
            String name = scan.next();
            File f = new File(name+".txt");
            if(!f.exists()){
                f.createNewFile();
                System.out.println("El archivo ha sido creado correctamente");
            }else{
                System.out.println("El archivo ya existe");
            }
        
    }
    public static void Escribir() throws IOException{
            PrintWriter pw = new PrintWriter(new FileWriter(scan.next()+".txt",true));
            pw.println(scan.next());
            pw.close();
    }
    
}

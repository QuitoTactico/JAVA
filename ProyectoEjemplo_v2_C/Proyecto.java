import java.io.*;

public class Proyecto
{
    static double NOTA_MINIMA = 3.0;
    static String resultado = "";
    
    static double grade;
    static String name;
    static char gender;
    static int age;
    static long mobileNo;
    
    public Proyecto()
    {
        
    }
    
    public static void main(String[] args)
    {
        Captura moduloCaptura = new Captura();
        
        moduloCaptura.captarDatosPersonales();
        
        grade = moduloCaptura.getGrade();
        name = moduloCaptura.getName();
        gender = moduloCaptura.getGender();
        age = moduloCaptura.getAge();
        mobileNo = moduloCaptura.getmobileNo();
        
        /*** MODULO ACTUADOR ***/
        
        
        if(grade < NOTA_MINIMA){
              System.out.println("ALERTA: nota perdida");
        }
        
        
        /*** MODULO PROCESAMIENTO ***/
        if(grade > 4.0){
            resultado = "Felicitaciones! :)";
        }else if (grade > 3.0 && grade <= 4.0){
            resultado = "Bien :|";
        }else{
            resultado = "Nada que hacer :(";
        }
        
        /*** MODULO PERSISTENCIA ***/      
        
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("./prueba.txt");
            pw = new PrintWriter(fichero);
               
               pw.println("Nombre: "+name);
               pw.println("Género: "+gender);
               pw.println("Edad: "+age);
               pw.println("Teléfono: "+mobileNo);
               pw.println("Nota: "+grade);
               pw.println("Resultado: "+resultado);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
        
        /*** MODULO VISUALIZACION ***/
        
        // Imprima los valores para verificar si la entrada
        // fue obtenida correctamente.
        System.out.println("Nombre: "+name);
        System.out.println("Género: "+gender);
        System.out.println("Edad: "+age);
        System.out.println("Teléfono: "+mobileNo);
        System.out.println("Nota: "+grade);
        System.out.println("Resultado: "+resultado);
    }
}

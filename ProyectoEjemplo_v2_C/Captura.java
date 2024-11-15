import java.util.Scanner;

/*** MODULO CAPTURA ***/

public class Captura
{
        String name;
        char gender;
        int age;
        long mobileNo;
        double grade;
        
        public void captarDatosPersonales(){
            Scanner sc = new Scanner(System.in);

            // entrada de una cadena
            System.out.println("Escriba su nombre: ");
            name = sc.nextLine();

            // entrada de un carácter
            System.out.println("Indique su género (F/M): ");
            gender = sc.next().charAt(0);

            // Entrada de datos numéricos
            System.out.println("Escriba su edad: ");
            age = sc.nextInt();
            System.out.println("Escriba su número de teléfono: ");
            mobileNo = sc.nextLong();
            System.out.println("Escriba su nota: ");
            grade = sc.nextDouble();
        }
    
        public double getGrade(){
            return grade;
        }
        
        public String getName(){
            return name;
        }
        
        public char getGender(){
            return gender;
        }
        
        public int getAge(){
            return age;
        }
        
        public long getmobileNo(){
            return mobileNo;
        }
}

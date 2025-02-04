import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/*
 * https://youtu.be/eIrMbAQSU34?feature=shared
 * https://youtu.be/grEKMHGYyns?feature=shared
 */

public class _Repaso {
    public static void main(String[] args) {

        double a = 3.0F;                                // digit casting
        int b = (int)a;


        String c = "30";                                // string casting
        int d = Integer.parseInt(c);


        int[][] e = {{1,2,3}, {4,5,6}};                 // print matrixes
        System.out.println(Arrays.deepToString(e));


        ArrayList<Integer> a_list = new ArrayList<Integer>(); // ArrayLists
        a_list.add(20);
        a_list.size();


        final double PI = 3.1415926535F;                // constants


        String par = ( d % 2 == 0) ? "Sizas" : "Nozas"; // ternarios


        if(par == "Nozas") //return false;              // if-return simplificado


        /* 
         * %d - Enteros (decimal)                       // format printing
         * %f - Números de punto flotante
         * %s - Cadenas (String)
         * %c - Caracteres
         * %b - Booleanos    
         */
        System.out.printf("Píllese este número: %d\n", 3);


        /*
         * Map: Genérico                                // diccionarios
         * HashMap: El mejor, O(1)
         * LinkedHashMap: Mantiene el orden de inserción
         * TreeMap: Los almacena según reglas, orden
         */
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("Uno", 1);
        int mapa_res = mapa.get("Uno");
        for (Map.Entry<String, Integer> entrada : mapa.entrySet()) {    // for item / for each
            System.out.println(entrada.getKey() + " -> " + entrada.getValue());
        }


        Math.round(11.5F);                              // Math
        int aleatorio = (int) (Math.random() * 100);
        // floor, ceil, max, min, random (0:1) ...


        NumberFormat plata = NumberFormat.getCurrencyInstance(); // common formatting
        String plata_string = plata.format(123456789);
        System.out.println(plata_string);
        // String plata_string = NumberFormat.getPercentInstance().format(0.1);  // direct


        Scanner scanner = new Scanner(System.in);       // input XD
        String user_input = scanner.nextLine().trim(); 
        // .nextInt, .nextByte, .nextDouble, ...


        int miau = 3;                                   // switch
        switch (miau){
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("dos");
                break;
            case 3:
                System.out.println("tres");
                break;
            default:
                System.out.println("ni idea pa");
        }

    }
}

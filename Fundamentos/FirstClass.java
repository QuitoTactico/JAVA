//suma de bytes pendejos, me tocó descargar  
//librería y pura conversión
import java.lang.Integer;

public class FirstClass {
    public static byte sum (byte a, byte b) {
        int aa = a;
        int bb = b;
        int c = (aa + bb);
      Integer cc = new Integer(c);
        byte ccc = cc.byteValue();
        return ccc;
    }
    
    //solución más fácil, decir a qué lo pasa
    // con (tipoVariable)(vaina)
     static byte sumaFacil (byte a, byte b) {
        byte c = (byte)(a + b); //aquí
        return c;
    }
}
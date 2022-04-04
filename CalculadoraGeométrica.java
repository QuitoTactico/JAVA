//a importar el scanner para lo de abajo
import java.util.Scanner;
public class CalculadoraGeométrica
{
    int a;
    int b;
    
   public CalculadoraGeométrica(int a,int b){
       this.a = a;
       this.b = b;
       
       int c = Math.abs(a)*Math.abs(b);
       int d = Math.abs(a)+Math.abs(a)+Math.abs(b)+Math.abs(b);
       
       System.out.println(" -----  -----  -----  -2D-  -----  -----  -----");
       System.out.println("El área de un rectángulo de "+ a +" x "+ b + " es igual a " + c);
       System.out.println("y su perímetro es " + d +".");
       System.out.println();
   }
   Double e;
   Double f;
   Double g;

   public CalculadoraGeométrica(Double e,Double f, Double g){
       this.e = e;
       this.f = f;
       this.g = g;
       
       Double h = Math.abs(e*f*g);
       Double i = Math.abs(e*f*2)+Math.abs(e*g*2)+Math.abs(f*g*2);
       Double j = (Math.abs(e)*4)+(Math.abs(f)*4)+(Math.abs(g)*4);
       
       System.out.println(" -----  -----  -----  -3D-  -----  -----  -----");
       System.out.println("El volúmen de un paralelepípedo de dimensiones "+Math.abs(e)+" x "+Math.abs(f)+" x "+Math.abs(g)+" es "+h);
       System.out.println("la suma del área de sus lados es "+i);
       System.out.println("y la suma de la longitud de sus bordes es "+j);
       System.out.println();
   }
   //avr con el scanner que pasa
   public static void main(String[] args){
       Scanner s = new Scanner(System.in);
       /*si no le reconoce el double, es pq el scanner es pendejo y
        * le reconoce son comas en vez de puntos
        * q pendejo q es
        */
       double as = s.nextDouble();
       double bs = s.nextDouble();
       double cs = s.nextDouble();
       
       double hs = Math.abs(as*bs*cs);
       double is = Math.abs(as*bs*2)+Math.abs(as*cs*2)+Math.abs(bs*cs*2);
       double js = (Math.abs(as)*4)+(Math.abs(bs)*4)+(Math.abs(cs)*4);
       
       System.out.println(" -----  --S--  --C--  -3D-  --A--  --N--  -----");
       System.out.println("El volúmen de un paralelepípedo de dimensiones "+Math.abs(as)+" x "+Math.abs(bs)+" x "+Math.abs(cs)+" es "+hs);
       System.out.println("la suma del área de sus lados es "+is);
       System.out.println("y la suma de la longitud de sus bordes es "+js);
       System.out.println();
   }
}
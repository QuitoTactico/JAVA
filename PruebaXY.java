

public class PruebaXY
{
   double x;
   double y;
   public PruebaXY(double x, double y){
       this.x = x;
       this.y = y;
   }
   
   public double sumarMultis(PruebaXY prueba){
       double result = ((this.x * this.y)+(prueba.x * prueba.y));
       return result;
   }
   
   public static double estaticoLoMismo(PruebaXY p1, PruebaXY p2){
       return ((p2.x * p2.y)+(p1.x * p1.y));
   }
}

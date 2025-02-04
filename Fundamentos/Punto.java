

public class Punto
{
    private double X;
    private double Y;
    
    public Punto(double x, double y){
        this.X = x;
        this.Y = y;
    }
    public double getX(){
        return X;
    }
    public double getY(){
        return Y;
    }
    public void setX(double n){
        this.X = n;
    }
    public void setY(double n){
        this.Y = n;
    }
    public static double distancia(Punto p, Punto q){
        double d = Math.sqrt(Math.pow(p.getX()-q.getX(),2)+
        Math.pow(p.getY()-q.getY(),2) );
        return d;
    }
}

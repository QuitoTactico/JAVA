
public class Planeta
{
    private String nombre;
    private double masa;
    public static int contador = 0;
    
    public Planeta(){
        this("Tierra",5.972);
    }
    public Planeta(String n, double m){
        this.nombre = n;
        this.masa = m;
    }
    public String getNombre(){
        return nombre;
    }
    public double getMasa(){
        return masa;
    }
    public void setNombre(String n){
        this.nombre = n;
    }
    public void setMasa(double m){
        this.masa = m;
    }
    public static Planeta planetaMedio(Planeta p){
        Planeta q = new Planeta(p.getNombre(), (p.getMasa() / 2));
        return q;
    }
}

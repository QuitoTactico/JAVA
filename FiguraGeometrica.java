

public abstract class FiguraGeometrica
{
    String nombre;
    
    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract double calcularArea();
}

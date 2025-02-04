

public class Cuadrado extends FiguraGeometrica
{
    double lado;
    
    public Cuadrado(double lado) {
        super("Cuadrado");
        this.lado = lado;
    }
    
    @Override
    public double calcularArea() {
        return lado * lado;
    }
}



public class Circulo extends FiguraGeometrica
{
    double radio;
    
    public Circulo(double radio) {
        super("Circulo");
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

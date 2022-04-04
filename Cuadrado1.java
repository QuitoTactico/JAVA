

public class Cuadrado1 implements CalculadorDeArea
{
    double lado;
    public Cuadrado1(double lado) {
        this.lado = lado;
    }
    @Override
    public double calcularArea() {
        return lado * lado;
    }
}

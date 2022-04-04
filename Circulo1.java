

public class Circulo1 implements CalculadorDeArea
{
    double radio;
    public Circulo1(double radio) {
        this.radio = radio;
    }
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

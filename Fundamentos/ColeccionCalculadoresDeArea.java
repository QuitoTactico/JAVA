import java.util.ArrayList;
public class ColeccionCalculadoresDeArea
{
    ArrayList<CalculadorDeArea> array = new ArrayList<CalculadorDeArea>();
    public void AgregarAlArray(CalculadorDeArea c){
        array.add(c);
    }
    public void CalcularAreas(){
        System.out.println("Los resultados con muchos decimales son de");
        System.out.println("círculos. Los de pocos, son de cuadrados.");
        for(CalculadorDeArea c : array){
            System.out.println(c.calcularArea());
        }
    }
}

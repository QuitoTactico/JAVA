
public class Orco extends Monstruo
{
    private String grunyido;
    public Orco(String nombre , int sangre , String grunyido){
        super(nombre , sangre);
        this.grunyido = grunyido;
    }
    public void imprimirNombre(){
        System.out.println(getNombre());
    }
    @Override
    public void moverse(){
        System.out.println("Soy un orco, estoy corriendo "+ getNombre());
    }
}

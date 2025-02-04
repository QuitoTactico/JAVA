

public class Discoteca
{
    boolean bool = false;
    public boolean accesoDiscoteca(int edad, int dinero, String nombre){
        if(edad >= 18 && dinero >= 100 && !nombre.equals("jimmy")){
            this.bool = true;
        }
        return this.bool;
    }
}

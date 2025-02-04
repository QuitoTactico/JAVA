

public class Carro
{
    private String marca;
    private int cilindraje;
    
    public Carro (String marca, int cilindraje){
        this.marca = marca;
        this.cilindraje = cilindraje;
    }
    public String getMarca(){
        return this.marca;
    }
    public int getCilindraje(){
        return this.cilindraje;
    }
    public String marcaPotente(){
        if(cilindraje > 1600){
            return this.marca;
        }else{
            return "muy poco potente";
        }
    }
}

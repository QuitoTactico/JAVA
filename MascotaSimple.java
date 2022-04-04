
public class MascotaSimple
{
 private int edad = 8;
 private String nombre;
 public MascotaSimple(){
     this.nombre = "Kitty";
 }
 public MascotaSimple( String nombre){
     this.nombre = nombre;
 }
 public MascotaSimple( String nombre,int edad){
     /*Parece que en los dos creadores
      * de strings, hay que ingresarlos
      * con "" en el campo del creador.
      * q raro (si supieras al timpo que me
      * gasté por eso)
      */
     this.nombre = nombre;
     this.edad = edad;
 }
 
 public String getNombre(){
     return this.nombre;
 }
 public int getEdad(){
     return this.edad;
 }
}

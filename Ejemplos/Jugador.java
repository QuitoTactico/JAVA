public class Jugador {
    private String nombre;
    private int salud;

    public void setNombre(String n) {
        this.nombre = n;
    }

    public String getNombre() {
        return nombre;
    }

    public void setSalud(int s) {
        this.salud = s;
    }

    public int getSalud() {
        return salud;
    }

    public void reducirSalud(int s) {
        salud -= s;
    }

}

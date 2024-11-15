import java.util.Scanner;

import java.util.*;

public class PrincipalJugador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jugador j = new Jugador();
        int s = sc.nextInt();
        j.setSalud(s);
        String n = sc.next();
        j.setNombre(n);
        int a = sc.nextInt();
        j.reducirSalud(a);
        int b = sc.nextInt();
        j.reducirSalud(b);
        System.out.println(j.getNombre() + j.getSalud());
        sc.close();
    }
}

import java.util.Scanner;

public class PrincipalCalculadoraSimple {
    public static void main(String args[]) {
        CalculadoraSimple c = new CalculadoraSimple();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(c.sumar(x, y) + "\n" + c.restar(x, y));
        sc.close();
    }
}

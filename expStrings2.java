
import java.util.Scanner;
public class expStrings2
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String st1 = "Habia una vez una iguana";
        String st2 = new String("iguana");
        int exp = st1.compareTo(st2);
        boolean exp2 = st1.contains(st2);
        int exp3 = st1.indexOf(st2);
        String exp4 = st1.substring(2,7); 
        System.out.println(exp);
        System.out.println(exp2);
        System.out.println(exp3);
        System.out.println(exp4);
    }
}

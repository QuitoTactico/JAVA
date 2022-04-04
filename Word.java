
import java.util.Scanner;
public class Word
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String st = scan.nextLine();
        int num = st.length();
        String st2 = st.toLowerCase();
        int ind = st2.indexOf('a');
        
        System.out.println(num);
        System.out.println(ind);
    }
}

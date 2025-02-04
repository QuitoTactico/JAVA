
import java.util.Scanner;
public class ExtraccionProfesional
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        /*Todo esto sería mucho más fácil usando
         * una serie de replaceAll's que filtraran
         * el String, pero está nice!
         */
        int iniName = 18;
        int finName = text.indexOf("</div>");
        
        int iniApel = ((text.indexOf("tname'>")) +7);
        int finApel = text.indexOf("</div>", iniApel);
        
        System.out.println(text.substring(iniName,finName) + text.substring(iniApel,finApel));
    }
}

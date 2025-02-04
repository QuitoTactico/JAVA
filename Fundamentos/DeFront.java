
import java.util.Scanner;
public class DeFront
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        
        if(str.charAt(0) == 'a' && str.charAt(1) == 'b'){
            System.out.println(str);
        }else if(str.charAt(0) == 'a'){
            System.out.println("a"+str.substring(2,(str.length())));
        }else if(str.charAt(1) == 'b'){
            System.out.println("b"+str.substring(2,(str.length())));
        }else{
            System.out.println(str.substring(2,(str.length())));
        }
        
    }
}


import java.util.Scanner;
public class WithoutStringMio

{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String base = scan.nextLine();
        String eliminar = scan.nextLine();
        
        int n = base.length();
        
        int pos = base.indexOf(eliminar);
        for(int i = 0 ; i < n ; i = pos){
            pos = base.indexOf(eliminar,i);
            
            String sub = base.substring(i, pos);
            
            if(pos != -1){
                System.out.print(sub);
            }else{
                break;
            }
            
        }
    }
}

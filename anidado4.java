

public class anidado4
{
    public static void anidado4(int n){
        for(int i = 1; i <= n; i++){
            for(int m = (n + 1 - i) ; m > 0; m = m-1){
               System.out.print(i);
            }
        System.out.println();
        }
    }
}

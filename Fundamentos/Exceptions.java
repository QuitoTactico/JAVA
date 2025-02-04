
public class Exceptions{
    public static double div(int numera, int denomi) throws Exception{
        if(denomi != 0){
            return (double)(((double)numera) / ((double)denomi));
        }else{
            throw new Exception("pirobo estúpido, dizque denominador 0, estudie");
        }
    }
    public static void sexoso(int a, int b)throws Exception{
        try{
            System.out.println(div(a,b));
        }catch(Exception e){
            System.out.println("Pana, "+e);
        }
    }
}

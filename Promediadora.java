

public class Promediadora
{
    int a;
    int b;
    int c;
    
    public Promediadora(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void PromedioCreadores(){
        int suma = this.a+this.b+this.c;
        int promedio = suma/3;
        
        System.out.println("El promedio es: " + promedio);
    }
    
    String d;
    String e;
    String f;
    
    public Promediadora(String d, String e, String f){
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public void Sentence(){
        String SumaSentences = this.d + this.e + this.f;
        
        System.out.println(SumaSentences);
    }
}

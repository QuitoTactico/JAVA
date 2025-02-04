//nomas dice si es par o impar
public class EvenOrOdd {
    public static String even_or_odd(int number) {
        if(number%2 == 0){
          String ev = "Even";
          return ev;
        }else{
          String Od = "Odd";
          return Od;
        }
    }
// el return tiene ifs integrados
// (pregunta)? "cosa si sí" : "cosa si no";
    public static String even_or_FACIL(int number) {
        return (number%2 == 0)? "Even" : "Odd";
    }

}
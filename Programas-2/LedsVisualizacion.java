

public class LedsVisualizacion
{
    static public String EncenderLed(int result){
        if(result == 2){
            return "ledVerde(AmbienteÓptimo)";
        }else if(result == 1){
            return "ledAmarillo(AmbientePromedio)";
        }else if(result == 0){
            return "ledRojo(AmbientePésimo)";
        }else{
            return "null, recuerde primero encender el sistema";
        }
    }
    /*Realmente el código termina aquí, pero dependiendo del resultado
      ésto es lo que debe hacer el usuario */
    static public String LoQueDebeHacerElUsuario(int result){
        if(result == 2){
            return "Es un buen lugar para dormir, quédate y descansa.";
        }else if(result == 1){
            return "No es muy buen lugar para dormir, pero puedes intentarlo si quieres";
        }else if(result == 0){
            return "Es un muy mal lugar para dormir, busca otro y vuelve a revisar";
        }else{
            return "null, recuerde primero encender el sistema";
        }
    }
}


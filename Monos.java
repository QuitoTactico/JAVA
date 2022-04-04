

public class Monos
{
    boolean bool = false;
    public boolean problemaMonos(boolean sonrie_a, boolean sonrie_b){
        if(sonrie_a == true && sonrie_b == true){
            this.bool = true;
        }else if(sonrie_a == false && sonrie_b == false){
            this.bool = true;
        }
        return this.bool;
    }
}

public class parc1
{
    /*
    mi método*/
    public int multiplicarElementos(int [] nums){
        return multipArreglo(0, nums);
    }
    public int multipArreglo(int pos, int[]nums){
        if(pos == nums.length) return 1;
        else {
            return (nums[pos]*multipArreglo(pos+1, nums));
        }
    }
}

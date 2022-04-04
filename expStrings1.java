
public class expStrings1 {
    public static int findShort(String s) {
        int sho = s.length();
        
        String[] parts = s.split(" ");
        String part1 = parts[0]; 
        String part2 = parts[1];
        return sho;
    }
    public static int getSmallest(int[] a, int total){  
       int temp;  
       for (int i = 0; i < total; i++)   
       {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       return a[0];  
}  
    public static int prueba(String s) {  //no sirve
        int so = 100;
        String[] parts = s.split(" ");
        String part0 = parts[0];
        String part1 = parts[1];
        String part2 = parts[2];
        String part3 = parts[3];
        String part4 = parts[4];
        String part5 = parts[5];
        String part6 = parts[6];
        String part7 = parts[7];
        String part8 = parts[8];
        String part9 = parts[9];
        String part10 = parts[10];
        String part11 = parts[11];
        String part12 = parts[12];
        String part13 = parts[13];
        int a = part0.length();
        int b = part1.length();
        int lista[] = {a, b};
        
        return getSmallest(lista,2);
    }
}

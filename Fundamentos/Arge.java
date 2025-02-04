class Arge {
    
    public static int nbYear(int p0, double percent, int aug, int p) {
      int h = 1;
      percent = percent / 100;
      double result = p0 + (p0 * (percent*0.01))+ aug;
        while(result < p){
            result = result + ((result * percent)+ aug);
            h = (h + 1);
        }
      return h;
    }
    public static int nbYear2(int p0, double percent, int aug, int p) {
      int i = 0;
      double pop = (double)p0;
      double per2 = percent / 100;
        while(pop < p){
            pop = pop + ( pop * per2) + aug;
            i++;
        }
      return i;
    }
}
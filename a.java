public class a{
public int a(int a, int b, int c) {
  int d = a+b+c;
  if(a == b){
    d = d - 2*a;
  }
  if(a == c){
    d = d - 2*a;
  }
  if(b == c){
    d = d - 2*b;
  }
  if(d < 0){
    d = 0;
  }
  
  return d;
}
}

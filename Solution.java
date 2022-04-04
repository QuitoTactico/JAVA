public class Solution {

  public int solution(int number) {
    //TODO: Code stuff here
    int counter = 0;
    if(number > 0){
      for(int i = 1; i < number; i ++){
        if(i%3 == 0 || i%5 ==0){
          counter = counter + i;
        }
      }
      return counter;
    }else{
      return 0;
    }
  }
}
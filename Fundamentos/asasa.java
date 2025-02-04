
class asasa {
  public static String camelCase1(String input) {
    for(int i = 0; i < input.length() ; i++){
      if(Character.isUpperCase(input.charAt(i))== true){
        input = input.replace(input.valueOf(input.charAt(i)), (""+input.charAt(i)));
                i++;
      }
    }
    return input;
  }
  public static String camelCase(String input) {
    input = input.replaceAll("A"," A");
    input = input.replaceAll("B"," B");
    input = input.replaceAll("C"," C");
    input = input.replaceAll("D"," D");
    input = input.replaceAll("E"," E");
    input = input.replaceAll("F"," F");
    input = input.replaceAll("G"," G");
    input = input.replaceAll("H"," H");
    input = input.replaceAll("I"," I");
    input = input.replaceAll("J"," J");
    input = input.replaceAll("K"," K");
    input = input.replaceAll("L"," L");
    input = input.replaceAll("M"," M");
    input = input.replaceAll("N"," N");
    input = input.replaceAll("O"," O");
    input = input.replaceAll("P"," P");
    input = input.replaceAll("Q"," Q");
    input = input.replaceAll("R"," R");
    input = input.replaceAll("S"," S");
    input = input.replaceAll("T"," T");
    input = input.replaceAll("U"," U");
    input = input.replaceAll("V"," V");
    input = input.replaceAll("W"," W");
    input = input.replaceAll("X"," X");
    input = input.replaceAll("Y"," Y");
    input = input.replaceAll("Z"," Z");
    return input;
  }
  
  public static String camelCaseBUENO(String input) {
    for(int i = 0; i < input.length() ; i++){
      if(Character.isUpperCase(input.charAt(i))== true){
        input = input.replace(input.valueOf(input.charAt(i))," "+input.valueOf(input.charAt(i)));
                i++;
      }
    }
    return input;
  }
  public static String PUERTASIMULATOR(String phrase) {
    if(phrase == null || phrase == ""){
        return null;
    }
    phrase = phrase.replaceFirst((phrase.valueOf(phrase.charAt(0))), (phrase.valueOf(phrase.charAt(0))).toUpperCase());
    for(int i = 0; i < phrase.length() ; i++){
      if(phrase.charAt(i)== ' '){
        phrase = phrase.replaceAll((" "+phrase.valueOf(phrase.charAt(i+1))), " "+(phrase.valueOf(phrase.charAt(i+1))).toUpperCase());
                
      }
    }
    return phrase;
  }
}

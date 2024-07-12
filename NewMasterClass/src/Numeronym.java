import java.util.LinkedList;
import java.util.Queue;

public class Numeronym {
    public static boolean numeronym(String num, String input){
        if(num.length() > input.length()) return false;
        //f3b2k facebook
        //f9k  facebook
        int j=0;
      for(int i=0; i<num.length(); i++){
          if(Character.isDigit(num.charAt(i))){
              j += Integer.valueOf(num.charAt(i)+"");

          }else{
              if(j>= input.length() || num.charAt(i) != input.charAt(j)) {
                  return false;
              }
              j++;
          }

      }
      if(j==input.length()) return true;
      return false;
    }



    public static void main(String[] args) {
        String num = "f7";
        String input = "facebook";
        System.out.println(numeronym(num, input));
    }
}

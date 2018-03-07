import java.io.*;

class Occurrences {
  
  public static int count(String s, char c) {
    int num = 0;
    for (int i = 0; i < s.length(); i++) {
      if(s.charAt(i) == c) num++;
    }
    
    return num;
  }
  
  public static void main (String[] args) {
    String word = "Checking to see how many e's are in this string.";
    char letter = 'e';
    
    System.out.println(count(word, letter));
  }
}
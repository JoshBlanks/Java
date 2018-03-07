import java.io.*;

class Palindrome {
  
  static boolean isPal(char[] word) {
    int front = 0;
    int back = word.length - 1;
    
    while(front < back) {
      if(word[front] != word[back]) return false;
      front++;
      back--;
    }
    
    return true;
  }
  
  public static void main (String[] args) {
    String pal = "TestseT";
    char[] charArray = pal.toCharArray();
    
    Palindrome ob = new Palindrome();
    
    System.out.println(ob.isPal(charArray));
  }
}
import java.io.*;

class Permutation {
  
  public String swap(String s, int l, int r) {
    char temp;
    char[] charArray = s.toCharArray();
    temp = charArray[l];
    charArray[l] = charArray[r];
    charArray[r] = temp;
    return String.valueOf(charArray);
  }
  
  void permute(String s, int l, int r) {
    if(l == r) {
      System.out.println(s);
    } else {
      for(int i = 1; i <= r; i++) {
        s = swap(s, l, i);
        permute(s, l + 1, r);
        s = swap(s, l, i);
      }
    }
  }
  
  public static void main (String[] args) {
    String s = "JOSH";
    int n = s.length();
    Permutation ob = new Permutation();
    ob.permute(s, 0, n-1);
  }
}
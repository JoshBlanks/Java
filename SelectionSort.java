import java.io.*;

class SelectionSort {
  
  void sort(int arr[]) {
    int n = arr.length;
    
    for(int i = 0; i < n-1; i++) {
      int min = i;
      for(int j = i+1; j < n; j++) {
        if(arr[j] < arr[min]) min = j;  
      }
      
      int temp = arr[min];
      arr[min] = arr[i];
      arr[i] = temp;
    }
  }
  
  static void printArray(int arr[]) {
    int n = arr.length;
    for(int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    
    System.out.println();
  }
  
  public static void main (String[] args) {
    int arr[] = {12, 11, 13, 5, 6};
    
    SelectionSort ob = new SelectionSort();
    ob.sort(arr);
    
    printArray(arr);
  }
}

// Time Complexity: O(n^2) since two nested for loops
// Space: O(1)
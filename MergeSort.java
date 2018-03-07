import java.io.*;

class MergeSort {
  
  void merge(int arr[], int l, int m, int r) {
    int n1 = m - l + 1;
    int n2 = r - m;
    
    int L[] = new int[n1];
    int R[] = new int[n2];
    
    for(int i = 0; i < n1; i++) {
      L[i] = arr[l + i];
    }
    
    for(int j = 0; j < n2; j++) {
      R[j] = arr[m + 1 + j];
    }
    
    int x = 0;
    int y = 0;
    int z = l;
    while(x < n1 && y < n2) {
      if(L[x] <= R[y]) {
        arr[z] = L[x];
        x++;
      } else {
        arr[z] = R[y];
        y++;
      }
      z++;
    }
    
    while(x < n1) {
      arr[z] = L[x];
      z++;
      x++;
    }
    
    while(y < n2) {
      arr[z] = R[y];
      z++;
      y++;
    }
  }
   
  void sort(int arr[], int l, int r) {
    if(l < r) {
      int m = (l + r) / 2;
      sort(arr, l, m);
      sort(arr, m + 1, r);
      
      merge(arr, l, m, r);
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
    
    MergeSort ob = new MergeSort();
    ob.sort(arr, 0, arr.length - 1);
    
    printArray(arr);
  }
}

// Time Complexity: O(n*log(n)) in worst, average and best case
// Space: O(n)
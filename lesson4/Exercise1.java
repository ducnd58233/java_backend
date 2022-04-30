import java.util.Scanner;

public class Exercise1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] array1;
    int[] array2;
    int[] merged;
    int n1, n2, n;

    System.out.println("Nhap do dai mang 1: ");
    n1 = sc.nextInt();
    System.out.println("Nhap do dai mang 2: ");
    n2 = sc.nextInt();

    n = n1 + n2;
    array1 = new int[n1];
    array2 = new int[n2];
    merged = new int[n];
    
    
    System.out.println("Nhap gia tri mang 1: ");
    for (int i = 0; i < n1; i++) {
      System.out.println("Vi tri " + i);
      array1[i] = sc.nextInt();
    }

    System.out.println("Nhap gia tri mang 2: ");
    for (int i = 0; i < n2; i++) {
      System.out.println("Vi tri " + i);
      array2[i] = sc.nextInt();
    }

    merged = merge(merged, array1, array2, n1, n2);
    // merged = mergeSort(merged, n);

    merged = bubbleSort(merged);

    System.out.println("Mang 1: ");
    for (int idx = 0; idx < array1.length; idx++) {
      System.out.printf("%d ", array1[idx]);
    }

    System.out.println("Mang 2: ");
    for (int idx = 0; idx < array2.length; idx++) {
      System.out.printf("%d ", array2[idx]);
    }

    System.out.println("Mang merged: ");
    for (int idx = 0; idx < merged.length; idx++) {
      System.out.printf("%d ", merged[idx]);
    }
  } 


  static int[] bubbleSort(int[] a) {
    for (int i = 0; i < a.length - 1; i++) {
      for (int j = i + 1; j < a.length; j++) {
        if (a[i] > a[j]) {
          int temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }

    return a;
  }

  static int[] mergeSort(int[] a, int n) {
    if (n < 2) return a;

    int mid = n / 2;
    int[] l = new int[mid];
    int[] r = new int[n - mid];

    for (int i = 0; i < mid; i++) {
      l[i] = a[i];
    }

    for (int i = mid; i < n; i++) {
      r[i - mid] = a[i];
    }

    mergeSort(l, mid);
    mergeSort(r, n - mid);
    merge(a, l, r, mid, n - mid);

    return a;
  }

  static int[] merge(int[] a, int[] a1, int[] a2, int left, int right) {
    int k, i, j;
    int n1 = left;
    int n2 =  right;

    k = i = j = 0;

    while (i < n1 && j < n2) {
      if (a1[i] < a2[j]) {
        a[k++] = a1[i++];
      } else {
        a[k++] = a2[j++];
      }
    }

    
    while (i < n1) {
      a[k++] = a1[i++];
    }

    while (j < n2) {
      a[k++] = a2[j++];
    }
    

    return a;
  }
}

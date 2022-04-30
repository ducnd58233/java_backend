import java.util.Scanner;

public class Exercise2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap do dai mang: ");
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.println("Nhap gia tri mang: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println("Mang: ");
    for (int i = 0; i < n; i++) {
      System.out.printf("%d ", arr[i]);
    }


    arr = bubbleSort(arr);
    int[] result = removeDuplicate(arr);
    System.out.println("Mang khong lap: ");
    for (int idx = 0; idx < result.length; idx++) {
      System.out.printf("%d ", result[idx]);
    }
    System.out.println();
    System.out.printf("Do dai: %d\n", result.length);
  }

  static int[] bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }

    return arr;
  }

  static int[] removeDuplicate(int[] arr) {
    int[] newArr = new int[arr.length];
    int len = 0;

    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] != arr[i + 1]) {
        newArr[len++] = arr[i];
      }
    }

    if (newArr[len] != arr[arr.length - 1]) {
      newArr[len++] = arr[arr.length - 1]; 
    }

    int[] arrNoDup = new int[len];

    for (int i = 0; i < len; i++) {
      arrNoDup[i] = newArr[i];
    }
    
    return arrNoDup;
  }
}



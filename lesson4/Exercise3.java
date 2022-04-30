import java.util.Scanner;

public class Exercise3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap do dai mang: ");
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.println("Nhap gia tri cho mang: ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    int result = longestConsecutive(arr);

    System.out.printf("Result: %d\n", result);
  }

  static int longestConsecutive(int[] arr) {
    int start, end, cur_s, cur_e;
    start = end = cur_s = cur_e = 0;

    for (int i = 0; i < arr.length - 1; i++) {
      cur_s = i;

      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] - 1 == arr[j - 1]) {
          cur_e = j;
        } else {
          break;
        }
      }
      if (cur_e - cur_s > end - start) {
        start = cur_s;
        end = cur_e;
      }
    }

    for (int i = start; i <= end; i++) {
      System.out.printf("%d ", arr[i]);
    }

    int longest = end - start + 1;
    return longest;
  }
}

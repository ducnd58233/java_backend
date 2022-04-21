import java.util.Scanner;

public class Exercise1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input fibonanci length: ");
    int n = sc.nextInt();
    int res = 1;
    int prev = 0;

    System.out.printf("%d, ", res);
    for (int i = 2; i <= n; i++) {
      int temp = res;
      res += prev;
      prev = temp;
      System.out.printf("%d, ", res);
    }
  }
}

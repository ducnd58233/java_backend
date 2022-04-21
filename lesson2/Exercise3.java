import java.util.Scanner;

public class Exercise3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input a number: ");
    int n = sc.nextInt();
    System.out.println("Output: ");
    for (int i = 1; i <= 10; i++) {
      int res = n * i;
      System.out.printf("%d x %d = %d\n", n, i, res);
    }
  }
}

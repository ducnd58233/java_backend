import java.util.Scanner;

public class Exercise3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input amount of electricity used: ");
    int n = sc.nextInt();
    int money = 0;
    if (0 <= n && n <= 50) {
      money = n * 1388;
    } else if (n <= 100) {
      money = 50 * 1388 + (n - 50) * 1433;
    } else if (n <= 200) {
      money = 50 * 1388 + 50 * 1433 + (n - 100) * 1660;
    } else if (n <= 300) {
      money = 50 * 1388 + 50 * 1433 + 100 * 1660 + (n - 200) * 2082;
    } else if (n <= 400) {
      money = 50 * 1388 + 50 * 1433 + 100 * 1660 + 100 * 2082 + (n - 300) * 2324;
    } else {
      money = 50 * 1388 + 50 * 1433 + 100 * 1660 + 100 * 2082 + 100 * 2324 + (n - 400) * 2399;
    }

    System.out.println(money);
  }
}

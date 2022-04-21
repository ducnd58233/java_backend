import java.util.Scanner;

public class Exercise2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input number: ");
    int n = sc.nextInt();
    System.out.print("Output: ");
    String binary = "";
    while (n > 0) {
      binary += n % 2;
      n /= 2;
    }

    System.out.println(binary);
  }
}

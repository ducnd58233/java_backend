import java.util.Scanner;

public class Exercise1 {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input first number: ");
    int a = sc.nextInt();
    System.out.print("\nInput second number: ");
    int b = sc.nextInt();

    int sum = a + b;
    int sub = a - b;
    int multi = a * b;
    float divide = a / b;
    int modulo = a % b;
    System.out.printf("%d + %d = %d\n", a, b, sum);
    System.out.printf("%d - %d = %d\n", a, b, sub);
    System.out.printf("%d x %d = %d\n", a, b, multi);
    System.out.printf("%d / %d = %.2f\n", a, b, divide);
    System.out.printf("%d mod %d = %d\n", a, b, modulo);
  }
}
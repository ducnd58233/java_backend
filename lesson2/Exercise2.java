import java.util.Scanner;

public class Exercise2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input number: ");
    String n = sc.nextLine();
    System.out.println("Output: ");
    int n1 = Integer.parseInt(n);
    int n2 = Integer.parseInt(n + n);
    int n3 = Integer.parseInt(n + n + n);
    int output = n1 + n2 + n3;
    System.out.printf("%d + %d + %d = %d\n", n1, n2, n3, output);
  }
}

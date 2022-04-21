import java.util.Scanner;

public class Exercise4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input number: ");
    int n = sc.nextInt();
    int sum = 0;

    for (int i = 1; i <= n; i++) {
      sum += i;
    }

    float avg = sum / (float)n;

    System.out.printf("sum = %d\n", sum);
    System.out.printf("avg = %.2f\n", avg);
    
  }
}

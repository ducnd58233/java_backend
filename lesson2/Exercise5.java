import java.util.Scanner;

public class Exercise5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("First number = ");
    int a = sc.nextInt();
    System.out.print("Second number = ");
    int b = sc.nextInt();
    
    int res = a * b;
    System.out.printf("Result = %d\n", res);
  }
}

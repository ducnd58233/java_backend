package activity1;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap chieu dai: ");
    int dai  = sc.nextInt();;

    System.out.println("Nhap chieu rong: ");
    int rong  = sc.nextInt();;

    Rectangle rec = new Rectangle(rong, dai);

    System.out.println("Dien tich: " + rec.area());
    System.out.println("Chu vi: " + rec.perimeter());
    System.out.println(rec);
    System.out.println("Co phai hinh vuong: " + rec.isSquare());
  }
}

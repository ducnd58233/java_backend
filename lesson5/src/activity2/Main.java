package activity2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tong so sinh vien: ");
        int n = sc.nextInt();

        StudentManagement sm = new StudentManagement(n);
        sm.setStudents();
        System.out.println("Tong so sinh vien do: " + sm.numberStudentsPassed());
        System.out.println("Tong so sinh vien truot: " + sm.numberStudentsFailed());
        System.out.println("Sinh vien diem cao nhat: " + sm.highestStudent());
        System.out.println("Sinh vien diem thap nhat: " + sm.lowestStudent());
    }
}

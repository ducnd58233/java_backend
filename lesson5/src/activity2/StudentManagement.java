package activity2;

import java.util.Scanner;

public class StudentManagement {
    private int n;
    Student[] students;
    Scanner sc = new Scanner(System.in);

    public StudentManagement(int n) {
        this.n = n;
        students = new Student[n];
    }

    public void setStudents() {
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap ten hoc sinh #" + i + ": ");
            String name = sc.nextLine();
            System.out.println("Nhap GPA hoc sinh #" + i + ": ");
            float gpa = sc.nextFloat();
            Student student = new Student(name, gpa);
            students[i] = student;
            sc.nextLine();
        }
    }

    public int numberStudentsPassed() {
        int total = 0;

        for (int i = 0; i < n; i++) {
            if (students[i].isPassed()) {
                total++;
            }
        }

        return total;
    }

    public int numberStudentsFailed() {
        int total = 0;

        for (int i = 0; i < n; i++) {
            if (!students[i].isPassed()) {
                total++;
            }
        }

        return total;
    }

    public Student highestStudent() {
        float max = 0;
        int idx = -1;
        for (int i = 0; i < n; i++) {
            float gpa = students[i].getGPA();
            if (Float.compare(max, gpa) < 0) {
                max = gpa;
                idx = i;
            }
        }

        return students[idx];
    }

    public Student lowestStudent() {
        float min = Float.POSITIVE_INFINITY;
        int idx = -1;
        for (int i = 0; i < n; i++) {
            float gpa = students[i].getGPA();
            if (Float.compare(min, gpa) > 0) {
                min = gpa;
                idx = i;
            }
        }

        return students[idx];
    }
}

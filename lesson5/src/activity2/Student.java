package activity2;

public class Student {
    private String name;
    private float gpa;

    public Student() {}

    public Student(String name, float gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGPA() {
        return gpa;
    }

    public void setGPA(float gpa) {
        if (Float.compare(gpa, (float) 0.0) > 0 && Float.compare(gpa, (float) 4.0) < 0) {
            this.gpa = gpa;
        }
    }

    public boolean isPassed() {
        return Float.compare(gpa, (float) 1.5) > 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}

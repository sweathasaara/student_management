public class Student {
    private int rollNo;
    private String name;
    public Student(int rollNo, String name, String studentClass) {
    this.rollNo = rollNo;
    this.name = name;
    this.studentClass = studentClass;
}
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }
    public void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name);
    }
    private String studentClass;

public String getStudentClass() {
    return studentClass;
}
}

public class Student {
    private int rollNo;
    private String name;
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
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
}

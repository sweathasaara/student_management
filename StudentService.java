import java.util.ArrayList;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();
    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added successfully!");
    }
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found!");
            return;
        }

        for (Student s : students) {
            s.display();
        }
    }
    public void searchByName(String name) {
        boolean found = false;

        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                s.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Student not found!");
        }
    }
    public void searchByRollNo(int rollNo) {
        boolean found = false;

        for (Student s : students) {
            if (s.getRollNo() == rollNo) {
                s.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Student not found!");
        }
    }
    public void deleteStudent(int rollNo) {
        boolean removed = false;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getRollNo() == rollNo) {
                students.remove(i);
                removed = true;
                System.out.println("Student deleted successfully!");
                break;
            }
        }

        if (!removed) {
            System.out.println("Student not found!");
        }
    }
}

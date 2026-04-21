import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map;
import java.util.HashMap;
public class StudentService {
        private Set<String> attendance = new HashSet<>();


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
private Map<String, Set<String>> attendanceByDate =new HashMap<>();
public void markAttendanceByDate(
        String date,
        String studentName) {

    if(!attendanceByDate.containsKey(date)) {

        attendanceByDate.put(
            date,
            new HashSet<>()
        );
    }

    Set<String> dailyAttendance =
            attendanceByDate.get(date);

    if(dailyAttendance.add(studentName)) {

        System.out.println(
            studentName +
            " marked present on " + date
        );
    }
    else {

        System.out.println(
            "Duplicate entry not allowed. " +
            studentName +
            " already marked present on "
            + date
        );
    }
}
    public void markPresent(String name) {

        if (attendance.add(name)) {
            System.out.println(name + " marked Present");
        }
        else {
            System.out.println(
                name + " already marked Present"
            );
        }
    }

public void viewAttendanceByDate(
        String date) {

    if(!attendanceByDate.containsKey(date)) {

        System.out.println(
            "No attendance found for "
            + date
        );

        return;
    }

    System.out.println(
        "Attendance for " + date
    );

    for(String s :
       attendanceByDate.get(date)) {

        System.out.println(s);
    }
}
public void viewClassWiseAttendance(
        String className,
        String date) {

    if(!attendanceByDate.containsKey(date)) {

        System.out.println(
            "No attendance found"
        );

        return;
    }

    Set<String> daily =
            attendanceByDate.get(date);

    for(Student s : students) {

        if(s.getStudentClass()
              .equalsIgnoreCase(className)
           &&
           daily.contains(
              s.getName())) {

            s.display();
        }
    }
}
public void showAttendanceSummary() {

    System.out.println(
        "Attendance Summary"
    );

    for(String date :
        attendanceByDate.keySet()) {
        System.out.println( date + " -> " + attendanceByDate.get(date).size()+ " students present");
    }
}
    public void viewPresentStudents() {
        if (attendance.isEmpty()) {
            System.out.println(
                "No students marked present"
            );
            return;
        }

        for (String s : attendance) {
            System.out.println(s);
        }
    }


    public void viewAlphabeticalStudents() {

        if (attendance.isEmpty()) {
            System.out.println(
                "No students marked present"
            );
            return;
        }
        TreeSet<String> sorted =
                new TreeSet<>(attendance);

        for (String s : sorted) {
            System.out.println(s);
        }
    }
    public void checkStudentPresent(String name) {

        if (attendance.contains(name)) {
            System.out.println(
                name + " is Present"
            );
        }
        else {
            System.out.println(
                name + " is Absent"
            );
        }
    }
    public void markAbsent(String name) {

        if (attendance.remove(name)) {
            System.out.println(
                name + " marked Absent"
            );
        }
        else {
            System.out.println(
                "Student not found in attendance"
            );
        }
    }
    public void totalPresentStudents() {

        System.out.println(
            "Total Present Students: "
            + attendance.size()
        );
    }

}

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();
        while (true) {
            System.out.println("\nStudent Management ");
            System.out.println("1. Add New Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search by Name");
            System.out.println("4. Search by Roll No");
            System.out.println("5. Delete Student");
            System.out.println("6. Mark Student Present");
            System.out.println("7. View All Present Students");
            System.out.println("8. View Students in Alphabetical Order");
            System.out.println("9. Check if Student is Present");
            System.out.println("10. Remove Student - Mark Absent");
            System.out.println("11. Show Total Present Students");
            System.out.println("12. Mark Attendance By Date");
            System.out.println("13. View Attendance By Date");
            System.out.println("14. View Class-wise Attendance");
            System.out.println("15. Show Attendance Summary");       
             System.out.println("16. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Class/Section: ");
                    String studentClass = sc.nextLine();
                    service.addStudent(
                    new Student(roll, name, studentClass));
                    break;
                case 2:
                    service.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter Name: ");
                    String searchName = sc.nextLine();
                    service.searchByName(searchName);
                    break;

                case 4:
                    System.out.print("Enter Roll No: ");
                    int searchRoll = sc.nextInt();
                    service.searchByRollNo(searchRoll);
                    break;

                case 5:
                    System.out.print("Enter Roll No to delete: ");
                    int deleteRoll = sc.nextInt();
                    service.deleteStudent(deleteRoll);
                    break;
                 case 6:
                    System.out.print("Enter Student Name: ");
                    service.markPresent(sc.nextLine());
                    break;
                case 7:
                    service.viewPresentStudents();
                    break;
                case 8:
                    service.viewAlphabeticalStudents();
                    break;
                case 9:
                    System.out.print("Enter Name: ");
                    service.checkStudentPresent(sc.nextLine());
                    break;
                case 10:
                    System.out.print("Enter Name: ");
                    service.markAbsent( sc.nextLine());
                    break;
                case 11:
                    service.totalPresentStudents();
                    break;
                case 12:
                    System.out.print("Enter Date: ");
                    String date = sc.nextLine();
                    System.out.print("Enter Student Name: ");   
                    String studentName =sc.nextLine();
                    service.markAttendanceByDate(date,studentName);
                    break;
                case 13:
                    System.out.print("Enter Date: ");
                    service.viewAttendanceByDate(
                        sc.nextLine());
                        break;
                case 14:
                    System.out.print("Enter Class: ");
                    String cls =sc.nextLine();
                    System.out.print("Enter Date: ");
                    String d =sc.nextLine();
                    service.viewClassWiseAttendance(cls,d);
                    break;
                case 15:
                    service.showAttendanceSummary();
                    break;
                case 16:
                    System.out.println(  "Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }

    }
}
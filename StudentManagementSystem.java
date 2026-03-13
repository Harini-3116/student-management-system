import java.util.*;

class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("ID: " + id + " | Name: " + name + " | Marks: " + marks);
    }
}

public class StudentManagementSystem {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        students.add(new Student(id, name, marks));

        System.out.println("Student Added Successfully!");
    }

    static void removeStudent() {
        System.out.print("Enter ID to remove: ");
        int id = sc.nextInt();

        for (Student s : students) {
            if (s.id == id) {
                students.remove(s);
                System.out.println("Student Removed!");
                return;
            }
        }

        System.out.println("Student Not Found!");
    }

    static void displayStudents() {

        if (students.isEmpty()) {
            System.out.println("No students available");
            return;
        }

        for (Student s : students) {
            s.display();
        }
    }

    static void searchStudent() {
        System.out.print("Enter ID to search: ");
        int id = sc.nextInt();

        for (Student s : students) {
            if (s.id == id) {
                System.out.println("Student Found:");
                s.display();
                return;
            }
        }

        System.out.println("Student Not Found");
    }

    static void updateMarks() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        for (Student s : students) {
            if (s.id == id) {

                System.out.print("Enter new marks: ");
                s.marks = sc.nextInt();

                System.out.println("Marks Updated!");
                return;
            }
        }

        System.out.println("Student Not Found");
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n---- Student Management System ----");
            System.out.println("1 Add Student");
            System.out.println("2 Remove Student");
            System.out.println("3 Display Students");
            System.out.println("4 Search Student");
            System.out.println("5 Update Marks");
            System.out.println("6 Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    removeStudent();
                    break;

                case 3:
                    displayStudents();
                    break;

                case 4:
                    searchStudent();
                    break;

                case 5:
                    updateMarks();
                    break;

                case 6:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: // Add
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // flush newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    students.add(new Student(id, name, age));
                    System.out.println("Student added.");
                    break;

                case 2: // View
                    System.out.println("\nAll Students:");
                    for (Student s : students) {
                        System.out.println(s);
                    }
                    break;

                case 3: // Update
                    System.out.print("Enter Student ID to update: ");
                    int updateId = sc.nextInt();
                    boolean found = false;
                    for (Student s : students) {
                        if (s.id == updateId) {
                            sc.nextLine(); // flush newline
                            System.out.print("Enter new name: ");
                            s.name = sc.nextLine();
                            System.out.print("Enter new age: ");
                            s.age = sc.nextInt();
                            System.out.println("Student updated.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Student not found!");
                    break;

                case 4: // Delete
                    System.out.print("Enter Student ID to delete: ");
                    int deleteId = sc.nextInt();
                    students.removeIf(s -> s.id == deleteId);
                    System.out.println("Student deleted if existed.");
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }
}

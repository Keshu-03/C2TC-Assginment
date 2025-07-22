package entityclassassignment1;
import java.util.Scanner;
public class ThreeStudent {
    private String name;
    private int rollNumber;
    private String department;
    public ThreeStudent(String name, int rollNumber, String department) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.department = department;
    }

   
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Department: " + department);
        System.out.println("------------------------");
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ThreeStudent[] students = new ThreeStudent[3];

        System.out.println("Enter details for 3 students:");

        for (int i = 0; i < 3; i++) {
            System.out.println("Student " + (i + 1) + " details:");
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter roll number: ");
            int rollNumber = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter department: ");
            String department = scanner.nextLine();

            students[i] = new ThreeStudent(name, rollNumber, department);
        }

        System.out.println("\n--- Student Details ---");
        for (ThreeStudent s : students) {
            s.displayDetails();
        }

        scanner.close();
    }
}



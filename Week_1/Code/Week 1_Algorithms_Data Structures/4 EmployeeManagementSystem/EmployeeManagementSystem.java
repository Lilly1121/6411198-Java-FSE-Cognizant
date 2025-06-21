import java.util.Scanner;

class Employee {
    int employeeId;
    String name;
    String position;
    double salary;

    public Employee(int employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void display() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Position: " + position + ", Salary: ₹" + salary);
    }
}

public class EmployeeManagementSystem {
    static Employee[] employees = new Employee[100];
    static int count = 0;

    public static void addEmployee(Employee e) {
        if (count < employees.length) {
            employees[count++] = e;
            System.out.println("Employee added successfully.\n");
        } else {
            System.out.println("Employee array is full.\n");
        }
    }

    public static void searchEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                System.out.println("Employee Found:");
                employees[i].display();
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.\n");
    }

    public static void deleteEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null;
                System.out.println("Employee deleted successfully.\n");
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.\n");
    }

    public static void listEmployees() {
        if (count == 0) {
            System.out.println("No employee records found.\n");
        } else {
            System.out.println("Employee List:");
            for (int i = 0; i < count; i++) {
                employees[i].display();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add Employee\n2. Search Employee\n3. Delete Employee\n4. Display All\n0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Position: ");
                    String pos = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    double sal = sc.nextDouble();
                    addEmployee(new Employee(id, name, pos, sal));
                    break;
                case 2:
                    System.out.print("Enter ID to Search: ");
                    searchEmployee(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Enter ID to Delete: ");
                    deleteEmployee(sc.nextInt());
                    break;
                case 4:
                    listEmployees();
                    break;
                case 0:
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("Invalid choice.\n");
            }
        } while (choice != 0);

        sc.close();
    }
}

import java.util.Scanner;

// Class to represent a Task
class Task {
    int taskId;
    String taskName;
    String status;

    public Task(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
    }

    @Override
    public String toString() {
        return "TaskId: " + taskId + ", TaskName: " + taskName + ", Status: " + status;
    }
}

// Node class for singly linked list
class Node {
    Task task;
    Node next;

    public Node(Task task) {
        this.task = task;
        this.next = null;
    }
}

// Singly linked list to manage tasks
class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        head = null;
    }

    // Add task at the end
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
    }

    // Search task by ID
    public Task searchTask(int taskId) {
        Node temp = head;
        while (temp != null) {
            if (temp.task.taskId == taskId)
                return temp.task;
            temp = temp.next;
        }
        return null;
    }

    // Delete task by ID
    public void deleteTask(int taskId) {
        if (head == null)
            return;

        if (head.task.taskId == taskId) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.task.taskId != taskId)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    // Traverse the task list
    public void traverse() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.task);
            temp = temp.next;
        }
    }
}

// Main class to run the task manager
public class TaskManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList taskList = new SinglyLinkedList();
        int choice;

        do {
            System.out.println("\n--- Task Management System ---");
            System.out.println("1. Add Task");
            System.out.println("2. Search Task");
            System.out.println("3. Delete Task");
            System.out.println("4. Display All Tasks");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Task ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Task Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Task Status (Complete/Incomplete): ");
                    String status = sc.nextLine();
                    taskList.addTask(new Task(id, name, status));
                    break;

                case 2:
                    System.out.print("Enter Task ID to Search: ");
                    int searchId = sc.nextInt();
                    Task found = taskList.searchTask(searchId);
                    if (found != null)
                        System.out.println("Found Task: " + found);
                    else
                        System.out.println("Task not found.");
                    break;

                case 3:
                    System.out.print("Enter Task ID to Delete: ");
                    int deleteId = sc.nextInt();
                    taskList.deleteTask(deleteId);
                    System.out.println("Task deleted (if found).");
                    break;

                case 4:
                    System.out.println("\nAll Tasks:");
                    taskList.traverse();
                    break;

                case 0:
                    System.out.println("Exiting Task Manager...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        sc.close();
    }
}

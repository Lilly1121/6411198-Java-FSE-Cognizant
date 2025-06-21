import java.util.Scanner;

public class SortOrders {

    // Bubble Sort based on totalPrice
    public static void bubbleSort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (orders[j].totalPrice > orders[j + 1].totalPrice) {
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    // Quick Sort based on totalPrice
    public static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);
            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    public static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].totalPrice;
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (orders[j].totalPrice < pivot) {
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;
        return i + 1;
    }

    // Print all orders
    public static void printOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.println(order);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Order[] orders = new Order[5];
        orders[0] = new Order(101, "Alice", 1500.50);
        orders[1] = new Order(102, "Bob", 3200.75);
        orders[2] = new Order(103, "Charlie", 950.25);
        orders[3] = new Order(104, "David", 4200.00);
        orders[4] = new Order(105, "Eva", 1800.00);

        System.out.println("Original Order List:");
        printOrders(orders);

        System.out.println("\nSorted by Bubble Sort (Total Price Ascending):");
        bubbleSort(orders);
        printOrders(orders);

        // Reset original list for quick sort demonstration
        orders[0] = new Order(101, "Alice", 1500.50);
        orders[1] = new Order(102, "Bob", 3200.75);
        orders[2] = new Order(103, "Charlie", 950.25);
        orders[3] = new Order(104, "David", 4200.00);
        orders[4] = new Order(105, "Eva", 1800.00);

        System.out.println("\nSorted by Quick Sort (Total Price Ascending):");
        quickSort(orders, 0, orders.length - 1);
        printOrders(orders);

        sc.close();
    }
}

import java.util.Scanner;

public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double principal, double rate, int years) {
        // Base case
        if (years == 0) {
            return principal;
        }
        // Recursive case
        return calculateFutureValue(principal * (1 + rate), rate, years - 1);
    }

    public static void main(String[] args) {1
        Scanner scanner = new Scanner(System.in);

        // Input principal amount
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual growth rate : ");
        double rate = scanner.nextDouble();

        // Input number of years
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        // Calculate and display future value
        double futureValue = calculateFutureValue(principal, rate, years);
        System.out.printf("Future value after %d years: %.2f\n", years, futureValue);

        scanner.close();
    }
}

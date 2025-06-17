public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment());
        context.pay(1500.00);

        context.setPaymentStrategy(new PayPalPayment());
        context.pay(2750.50);
    }
}

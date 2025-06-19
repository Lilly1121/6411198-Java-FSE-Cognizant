public class Main {
    public static void main(String[] args) {
        Notifier baseNotifier = new EmailNotifier();

        Notifier smsNotifier = new SMSNotifierDecorator(baseNotifier);
        Notifier slackAndSmsNotifier = new SlackNotifierDecorator(smsNotifier);

        slackAndSmsNotifier.send("System will undergo maintenance at 10 PM.");
    }
}

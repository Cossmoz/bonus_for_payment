public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int payment = 1441;
        int totalBalance;

        if (payment > 1000) {
            totalBalance = (balance + payment) + (payment / 100);
        } else {
            totalBalance = balance + payment;
        }
    System.out.println(totalBalance);
    }
}

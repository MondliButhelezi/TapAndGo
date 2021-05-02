package payment;

public class TapCard {
    public static void main(String[] args) {
        TapMyPayments tap = new TapMyPayments();
        tap.deposit(500);
        tap.pay(115.56 );
        tap.getBalance();
    }
}

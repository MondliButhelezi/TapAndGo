package payment;

public class TapCard {
    public static void main(String[] args) {
        TapMyPayments tap = new TapMyPayments();
        tap.deposit(100);
        tap.pay(25.56 );
        tap.pay(89.77 );
        tap.getBalance();
    }
}

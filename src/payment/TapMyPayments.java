package payment;

public class TapMyPayments {
    double accountBalance;


    void deposit(double deposited){
        accountBalance += deposited;
        System.out.println("You have deposited an amount of R"+ accountBalance + " to your account." );
    }
    void pay(double amountToPay){
       accountBalance -= amountToPay;
        System.out.println("You have paid a vendor an amount of R" + amountToPay);
    }

    void getBalance() {
        System.out.println("Your account has a balance of R"+ accountBalance );
    }

    public static void main(String[] args) {
        TapMyPayments tap = new TapMyPayments();
        tap.deposit(500);
        tap.pay(115.56 );
        tap.getBalance();
    }
}

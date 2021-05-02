package payment;

public class TapMyPayments {
    double accountBalance;
    double amountToPay;
    double amountToDeposit;

    void pay(double amountToPay){
       accountBalance += amountToPay;
    }

    void deposit(double deposited){
        amountToDeposit += deposited;
    }

    void getBalance() {
        System.out.println("The amount paid is R" + amountToPay);
        System.out.println("You have just deposited an amount of R"+ amountToDeposit );
    }

    public static void main(String[] args) {
        TapMyPayments am = new TapMyPayments();
        am.pay(115.56 );
        am.deposit();
        am.getBalance();
    }
}

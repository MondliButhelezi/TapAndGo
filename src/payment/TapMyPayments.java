package payment;

public class TapMyPayments {
    double accountBalance;


    void deposit(double deposited){
        accountBalance += deposited; //deposits the amount to the account that was initialized as zero
        System.out.println("You have deposited an amount of R"+ accountBalance + " to your account." );
    }
    
    void pay(double amountToPay){
       if (amountToPay > accountBalance) { // if amountToPay is bigger than my current balance it should not subtract my accountBalance
           System.out.println("You have insufficient funds.");
       } else {
           accountBalance -= amountToPay;
        System.out.println("You have paid a vendor an amount of R" + amountToPay);
       }
    }

    void getBalance() {
        System.out.println("Your account has a balance of R"+ accountBalance );
    }
}

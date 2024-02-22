import java.util.Scanner;

// Question 1 :- Modify class Account to provide a method called
// withdraw that withdraws money from an account. Ensure that the
// withdrawal amount does not exceed the account's balance.
// If it does, the balance should be left unchanged and the method should
// print a message indicating "Withdrawal amount exceeded account balance."
class account {
    private String name;
    private double balance, withdrawamount;

    account(String name, double balance) {
        this.name = name;
        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    void deposit(double depositamount) {
        if (depositamount > 0.0) {
            balance = balance + depositamount;
        }
    }

    double getbalance() {
        return balance;
    }

    String getname() {
        return name;
    }

    void withdraw() {
        System.out.println("How much you want to withdraw?");
        Scanner takeWithdraw = new Scanner(System.in);
        withdrawamount = takeWithdraw.nextDouble();
        if (withdrawamount > balance) {
            System.out.println("Withdrawal amount exceeded account balance");
        } else {
            balance = balance - withdrawamount;

        }
        System.out.println("Your remaining balance is: " + balance);
    }

}

public class cw2 {
    public static void displayAccount(account accountToDisplay) {

        System.out.println(accountToDisplay.getname() + " balance:" + accountToDisplay.getbalance());

    }

    public static void main(String args[]) {

        account account1 = new account("Jerry", 232);
        account account2 = new account("tom", 353);

        displayAccount(account1);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter deposit amount for account1");
        double deposit = input.nextDouble();
        System.out.println("Adding " + deposit + " to account1 balance");
        account1.deposit(deposit);
        System.out.println(account1.getbalance());
        displayAccount(account2);

        // account1.withdraw();

    }
}
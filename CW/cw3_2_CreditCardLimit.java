/* Question 2 :- Develop a java application that determines whether
any of several department store customers has exceeded the credit limit
on a charge amount. For each customer, the following facts are available:
a) account number
b) balance at the beginning of the month
c) total of all items charged by the customers this month
d) total of all credits applied to the customer's account this month
e) allowed credit limit

The program should input all these facts as integers, calculate the new
balance (new balance = beginning balance + charges - credits), display
the new balance and determine whether the new balance exceeds the
customer's credit limit. For those customers whose credit limit is
exceeded, the program should display the message "Credit limit exceeded".
*/

class creditlimitaccount {
    int accountNo, balance, noOfItems, totalcharges, creditsApplied, creditLimit;
    int newbalance;

    void setaccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // void setnoOfItems(int noOfItems)
    // {
    // this.noOfItems = noOfItems;
    // }

    void setcreditsApplied(int creditsApplied) {
        this.creditsApplied = creditsApplied;
    }

    void setcreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setTotalcharges(int totalcharges) {
        this.totalcharges = totalcharges;
    }

    public int getTotalcharges() {
        return totalcharges;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public int getBalance() {
        return balance;
    }

    public int getCreditsApplied() {
        return creditsApplied;
    }
    // public int getNoOfItems() {
    // return noOfItems;
    // }

    public int getNewbalance() {
        newbalance = balance + totalcharges - creditsApplied;
        if (creditLimit < newbalance) {
            System.out.println("Credit limit exceeded.");
            return newbalance;
        } else {
            return newbalance;
        }
    }
}

public class cw3_2_CreditCardLimit {
    public static void main(String args[]) {

        creditlimitaccount cl = new creditlimitaccount();

        cl.setaccountNo(31241);
        cl.setBalance(12000);
        cl.setTotalcharges(23000);
        cl.setcreditsApplied(30000);
        cl.setcreditLimit(30000);

        System.out.println(cl.getNewbalance());

    }
}
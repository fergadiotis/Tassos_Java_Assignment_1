public class Chap3_ex311 {

    private double balance;

    public Chap3_ex311(double initialBalance){
        if (initialBalance >= 0.0){
            balance = initialBalance;
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Withdraw amount exceeded account balance");
        }
    }

    public double getBalance() {
        return balance;
    }

}
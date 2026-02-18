public abstract class Account {
    protected double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ". New balance: " + balance);
    }

    public abstract void calculateInterest();

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        Account savingsAccount = new SavingsAccount(1000.0);
        Account currentAccount = new CurrentAccount(2000.0);

        System.out.println("Initial Savings Account Balance: " + savingsAccount.getBalance());
        System.out.println("Initial Current Account Balance: " + currentAccount.getBalance());

        savingsAccount.deposit(500.0);
        currentAccount.deposit(300.0);

        savingsAccount.calculateInterest();
        currentAccount.calculateInterest();

        SavingsAccount savings = new SavingsAccount(5000.0);
        CurrentAccount current = new CurrentAccount(3000.0);

        Transferable transferableSavings = savings;
        transferableSavings.transfer(1000.0, "Account#12345");

        StatementGenerator statementGen = current;
        statementGen.generateStatement();
        statementGen.logTransaction("Transfer of 500 completed successfully");

        Transferable transferableCurrent = current;
        transferableCurrent.transfer(750.0, "Account#67890");
    }
}

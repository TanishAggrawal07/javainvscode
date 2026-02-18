public class SavingsAccount extends Account implements Transferable {
    
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void calculateInterest() {
        double interest = balance * 0.045;
        balance += interest;
        System.out.println("SavingsAccount - Interest calculated: " + interest + ". New balance: " + balance);
    }

    @Override
    public void transfer(double amount, String targetAccount) {
        System.out.println("Transferring " + amount + " to " + targetAccount + ". (Fee applied)");
    }
}
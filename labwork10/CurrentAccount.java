public class CurrentAccount extends Account implements Transferable, StatementGenerator {
    
    public CurrentAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void calculateInterest() {
        double interest = balance * 0.005;
        balance += interest;
        System.out.println("CurrentAccount - Interest calculated: " + interest + ". New balance: " + balance);
    }

    @Override
    public void transfer(double amount, String targetAccount) {
        System.out.println("Transferring " + amount + " to " + targetAccount + ". (No Fee)");
    }

    @Override
    public void generateStatement() {
        System.out.println("Generating detailed monthly statement.");
    }
}

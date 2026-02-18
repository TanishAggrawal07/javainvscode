public interface StatementGenerator {
    void generateStatement();

    default void logTransaction(String details) {
        System.out.println("LOGGED: " + details);
    }
}

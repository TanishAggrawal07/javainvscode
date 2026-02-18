public class Main {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print("Hello World");
        p.print("Repeat", 3);
        p.print(new String[]{"One", "Two", "Three"});
    }
}
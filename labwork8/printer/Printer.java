public class Printer {
    public void print(String text) {
        System.out.println(text);
    }

    public void print(String text, int times) {
        for (int i = 0; i < times; i++)
            System.out.println(text);
    }

    public void print(String[] texts) {
        for (String t : texts)
            System.out.println(t);
    }
}

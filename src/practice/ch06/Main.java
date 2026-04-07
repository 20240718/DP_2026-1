package practice.ch06;
import ch06.Sample.MessageBox;

public class Main {
    public static void main(String[] args) {
        MessageBox m1 = new MessageBox('*');
        MessageBox m2 = new MessageBox('@');
        m1.use("Hello, world.");
        m2.use("Hello, world.");
    }
}
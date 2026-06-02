package hw.ch20;

public class Main {
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String ReSET = "\u001B[0m";
    public static void main(String[] args) {
        BigString bs = new BigString(args[0]);
        System.out.println("20240718 백다현");
        String[] colors = {RED, BLUE, GREEN, MAGENTA, CYAN, YELLOW, BLUE};
        if (args.length == 0) {
            System.out.println("Usage: java Main digits");
            System.out.println("Example: java Main 1212123");
            System.exit(0);
        }

        bs.print(colors);
    }
}

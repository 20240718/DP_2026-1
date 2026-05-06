package hw.ch12;

public class Main {
    public static void main(String[] args) {
        MultiStringDisplay md = new MultiStringDisplay();

        System.out.println("20240718 백다현");
        md.add("Hello, java!");
        md.add("Decorator pattern");
        md.add("is powerful!");
        md.show();

        Display d1 = new NumberedBorder(md);
        d1.show();

        Display d2 = new FullBorder(new NumberedBorder(md));
        d2.show();

        Display d3 = new SideBorder(new NumberedBorder(new FullBorder(md)), '*');
        d3.show();
    }
}

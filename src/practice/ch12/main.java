package practice.ch12;

public class main {
    public static void main(String[] args) {
        Display d1 = new StringDisplay("Hello, world."); //중심 객체
        Display d2 = new SideBorder(d1, '*'); // d1을 감싼 장식자
        Display d3 = new FullBorder(d1); // d2를 감싼 장식자
        Display d4 = new FullBorder(d2); 

        d1.show();
        d2.show();
        d3.show();
        d4.show();
    }
}

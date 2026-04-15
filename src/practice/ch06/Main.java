package practice.ch06;
import practice.ch06.MessageBox;
import practice.ch06.framework.Manager;;

public class Main {
    public static void main(String[] args) {
        /*
        //원본을 사용
        MessageBox m1 = new MessageBox('*');
        m1.use("Hello, world.");
        UnderlinePen u1 = new UnderlinePen('-');
        u1.use("Hello, world.");

        //복제된 객체를 사용
        m1.createCopy().use("Hello, world.");
        u1.createCopy().use("Hello, world.");
         */
        //준비
        Manager manager = new Manager();
        //원본 객체 생성 및 등록
        MessageBox m1 = new MessageBox('*');
        manager.register("Star box", m1);
        UnderlinePen u1 = new UnderlinePen('-'); //클래스1
        manager.register("Underline pen", u1); 
        MessageBox m2 = new MessageBox('/'); //클래스2
        manager.register("Slash box", m2);

        //복제된 객체 사용
        manager.create("Star box").use("Hello, world.");
        manager.create("Underline pen").use("Hello, world.");
        manager.create("Slash box").use("Hello, world.");
    }
}
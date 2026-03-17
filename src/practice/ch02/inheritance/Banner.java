package practice.ch02.inheritance;

//이미 제공되는 클래스
public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public Banner(Object string2) {
      //TODO Auto-generated constructor stub
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}

package ch02.Sample1;
//상속을 이용한것
public class Banner { //이미 존재하며 수정이 불가능 한 클래스
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() { //괄호
        System.out.println("(" + string + ")");
    }

    public void showWithAster() { //별
        System.out.println("*" + string + "*");
    }
}

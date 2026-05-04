package ch02.Sample2;
public class PrintBanner extends Print { //다중상속이 안돼 print를 추상클래스로
    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string); //
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}

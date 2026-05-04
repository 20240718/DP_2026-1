package ch02.Sample1;
//어댑터
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() { //상속받은 showWithParen() 메소드 이용
        showWithParen();
    }

    @Override
    public void printStrong() { //상속받은 showWithAster() 메소드 이용
        showWithAster();
    }
}

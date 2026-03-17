package practice.ch02.inheritance;
//어댑터 클래스
public class PrintBannerAdapter01 extends Banner implements Print { //타켓인터페이스를 제공한다.
    //(1) 읹자가 없는 생성자는 자동으로 만들어짐
    //(2) 생성자는 상속되지 않음(super사용)
    public PrintBannerAdapter01(String string) {
        super(string); //super: 부모 생성자(Banner)를 호출한다.
    }

    public PrintBannerAdapter01(Object string) {
      //TODO Auto-generated constructor stub
    }

    @Override
    public void printWeak() {
        showWithParen(); //(this.)메소드이름 이 생략됨
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
  
}

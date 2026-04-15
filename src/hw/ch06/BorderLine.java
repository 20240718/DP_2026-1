package hw.ch06;
import hw.ch06.framework.Product;

public class BorderLine implements Product{
  private char borderChar;

  //1. 생성자: 경계 문자를 인자로 받음
  public BorderLine(char borderChar){
    this.borderChar = borderChar;
  }
  //2. use()메소드 구현
  @Override
  public void use(String s){
    //입력 받은 문자열의 길이 만큼 경계선을 생성
    StringBuilder line = new StringBuilder();
    for(int i=0; i < s.length(); i++) line.append(borderChar);

    System.out.println(line.toString()); //위쪽 라인 출력
    System.out.println(s); //본문 출력
    System.out.println(line.toString()); //아래쪽 라인 출력
  }

  //creatCopy() 메소드 구현
  @Override
  public Product createCopy() {
    Product p = null;
    try {
        p = (Product)clone();
    } catch (CloneNotSupportedException e) {
        e.printStackTrace();
    }
    return p;
  }
}

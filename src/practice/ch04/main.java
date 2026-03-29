package practice.ch04;
import practice.ch04.framework.Product;
import practice.ch04.idcard.IDCard;
import practice.ch04.idcard.IDCardFactory;

public class main {
  public static void main(String[] args) {
    //(1) IDCard 직접 생성
    // IDCard id = new IDCard("홍길동");
    // id.use();

    //(2) 공장을 이용해서 IDCard 생성
    IDCardFactory f = new IDCardFactory();
    Product c = f.create("홍길동");
    c.use(); 
  }
}

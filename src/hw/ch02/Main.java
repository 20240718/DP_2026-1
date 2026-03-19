package hw.ch02;

public class Main {
  public static void main(String[] args) {
    KoreanOutlet koreanOutlet = new KoreanOutlet();
    KoreanOutletAdapter adapter = new KoreanOutletAdapter(koreanOutlet);

    //스마트폰에 전달
    Smartphone smartphone = new Smartphone(adapter);
    //charge 호출
    smartphone.charge();
  }
}

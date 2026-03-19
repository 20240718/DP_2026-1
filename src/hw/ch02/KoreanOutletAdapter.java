package hw.ch02;

public class KoreanOutletAdapter implements Charger{ //KoreanOutlet을 내부적으로 포함+Charger 인터페이스 구현
  private KoreanOutlet koreanOutlet;

  public KoreanOutletAdapter(KoreanOutlet koreanOutlet) {
    this.koreanOutlet = koreanOutlet;
  }

  @Override
  public int charge() {
    return koreanOutlet.provide();
  }
  
}

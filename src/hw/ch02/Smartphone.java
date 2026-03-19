package hw.ch02;

public class Smartphone {
  private Charger charger;

  public Smartphone(KoreanOutletAdapter adapter) {
    this.charger = (Charger) adapter;
  }

  public void charge() {
    int voltage = charger.charge();
    System.out.println("스마트폰이 " + voltage + "V로 충전됩니다.");
  }
}

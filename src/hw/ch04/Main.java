package hw.ch04;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;
import hw.ch04.idcard.IDCardFactory;
import hw.ch04.license.*;

public class Main {
    public static void main(String[] args) {
        //IDCard 정보 확장
        Factory factory1 = new IDCardFactory("2026-01-15");
        Product card1 = factory1.create("Youngjin Kim");
        Product card2 = factory1.create("Heungmin Son");
        card1.use();
        card2.use();
        
        //새로운 카드 타입
        Factory factory2 = new LicenseCardFactory("2026-03-20");
        Product license1 = factory2.create("Park Jisung");
        Product license2 = factory2.create("Lee Min-jae");
        license1.use();
        license2.use();
    }
}

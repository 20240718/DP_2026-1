package hw.ch04.idcard;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;

public class IDCardFactory extends Factory {
    private String baseDate; //카드 발급 기준 날짜를 저장하는 필드 추가
    private int serial = 1000;
    public IDCardFactory(String baseDate) { //카드 발급 기준 날짜를 전달받는 생성자 추가
        this.baseDate = baseDate;
    }
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner, serial++, baseDate); //baseDate를 사용하여 발급 날짜 설정
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}

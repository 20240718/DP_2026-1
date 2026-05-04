package ch04.Sample.idcard;

import ch04.Sample.framework.Factory;
import ch04.Sample.framework.Product;

public class IDCardFactory extends Factory { //Factory를 상속받는 IDCardFactory 클래스
    @Override //추상메소드 구현
    protected Product createProduct(String owner) {
        return new IDCard(owner); //IDCard 객체 생성
    }

    @Override
    protected void registerProduct(Product product) { //생성된 IDCard 객체 등록
        System.out.println(product + "을 등록했습니다.");
    }
}

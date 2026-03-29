package practice.ch04.idcard;

import ch04.Sample.framework.Factory;
import ch04.Sample.framework.Product;

public class IDCardFactory extends Factory {
    @Override
    protected IDCard createProduct(String owner) { //factory.java에서 product 를 리턴하고 있가애 IDCard가 아닌 Product를 리턴
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}

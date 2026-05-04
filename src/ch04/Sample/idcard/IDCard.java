package ch04.Sample.idcard;

import ch04.Sample.framework.Product;

public class IDCard extends Product { //Product를 상속받는 IDCard 클래스
    private String owner;

    IDCard(String owner) {
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }

    @Override //Product의 추상 메소드 use()를 구현
    public void use() {
        System.out.println(this + "을 사용합니다.");
    }

    @Override
    public String toString() {
        return "[IDCard:" + owner + "]";
    }

    public String getOwner() {
        return owner;
    }
}

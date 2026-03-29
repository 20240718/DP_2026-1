package practice.ch04.idcard;

import ch04.Sample.framework.Product; //내가 만든 클래스를 가져옴

public class IDCard extends Product {
    private String owner; //카드 소유자 이름을 저장하는 필드

    public IDCard(String owner) { //생성자, 카드 소유자 이름을 받아서 초기화 (public으로 변경해야 main에서 접근 가능)
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(this.toString() + "을 사용합니다.");
    }

    @Override
    public String toString() { //객체의 문자열이 필요할 때 자동으로 호출하는 메소드
        return "[IDCard:" + owner + "]";
    }

    public String getOwner() {
        return owner;
    }
}

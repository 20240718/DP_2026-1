package hw.ch04.idcard;

import hw.ch04.framework.Product;

public class IDCard extends Product {
    private String owner;
    private int serial;
    private String issuedDate; //발급 날짜 정보를 저장하는 필드

    IDCard(String owner) {
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }

    //생성자 추가
    IDCard(String owner, int serial, String issuedDate) {
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
        this.serial = serial;
        this.issuedDate = issuedDate; //전달받은 발급 날짜 정보를 필드에 저장
    }

    @Override
    public void use() {
        System.out.println(this + "을 사용합니다.");
    }

    @Override
    public String toString() {
        return "[IDCard:" + owner + ", serial:" + serial + ", issuedDate:" + issuedDate + "]";
    } //발급 날짜를 포함하여 출력

    public String getOwner() {
        return owner;
    }

    public int getSerial() {
        return serial;
    }

    public String getIssuedDate() { //발급 날짜 정보를 반환하는 메소드 추가
        return issuedDate;
    }
}

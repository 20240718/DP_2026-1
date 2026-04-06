package hw.ch04.license;
import hw.ch04.framework.Product;
public class LicenseCard extends Product {
    private String holder; //운전자 명
    private int LicenseNumber; //면허 번호
    private String issuedDate; //발급 날짜
    private String expiryDate; //만료 날짜

    //생성자 추가
    LicenseCard(String holder, int LicenseNumber, String issuedDate, String expiryDate) {
        System.out.println(holder + "의 운전면허증을 " + LicenseNumber + " 번으로 만듭니다.");
        this.holder = holder;
        this.LicenseNumber = LicenseNumber;
        this.issuedDate = issuedDate;
        this.expiryDate = expiryDate;
    } //생성자에서 발급 날짜와 만료 날짜를 전달받아 필드에 저장

    @Override
    public void use() { //this를 이용해 자동으로 toString()이 호출
        System.out.println(this + "을 사용합니다.");
    }

    @Override
    public String toString() {
        return "[LicenseCard:" + holder + "(" + LicenseNumber + ")] - 유효기간: " + issuedDate + " ~ " + expiryDate;
    }
}

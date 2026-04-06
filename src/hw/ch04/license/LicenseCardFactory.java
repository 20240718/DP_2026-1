package hw.ch04.license;
import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;

public class LicenseCardFactory extends Factory {
    private int licenseCounter = 100; //면허 번호 카운터
    private String baseDate; //카드 발급 기준 날짜를 저장하는 필드 추가
    public LicenseCardFactory(String baseDate) { //카드 발급 기준 날짜를 전달받는 생성자 추가
        this.baseDate = baseDate;
    }
    @Override
    protected Product createProduct(String owner) {
        return new LicenseCard(owner, licenseCounter++, baseDate, "2031-03-19"); //baseDate를 사용하여 발급 날짜 설정, 만료 날짜는 예시로 고정
    } //LicenseCard 생성(licenseCounter 증가)

    @Override
    protected void registerProduct(Product product) {
      System.out.println(product + "을 등록했습니다.");
    } //등록 메시지 출력
}

package hw.ch17;

public class Main {
    public static void main(String[] args) {
        System.out.println("20240718 백다현");
        NumberGenerator generator = new EvenNumberGenerator(0, 30);

        // 2. 관찰자 객체 3개 생성
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        Observer observer3 = new RangeObserver();

        // 3. 관찰 대상을 향해 관찰자들 등록
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.addObserver(observer3);

        // 4. 숫자 생성 실행 (상태 변화 통지 시작)
        generator.execute();
    }
}

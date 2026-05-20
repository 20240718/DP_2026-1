package hw.ch17;

public class EvenNumberGenerator extends NumberGenerator {
    private int number;	// 현재 생성된 수
    private int start;		// 시작값
    private int end;		// 종룟값(이 값은 포함하지 않는다)

    public EvenNumberGenerator(int start, int end) {
        this.start = start;
        this.end = end;
    }

    // 수를 취득한다 
    @Override
    public int getNumber() {
        return number;
    }

    // 수를 생성한다 
    @Override
    public void execute() {
        for (int i = start; i < end; i += 2) { // 짝수만 생성하기 위해 2씩 증가
            number = i;
            notifyObservers(); // 상태 변화를 등록된 Observer들에게 통지
        }
    }
  
}

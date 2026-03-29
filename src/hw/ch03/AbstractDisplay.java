package hw.ch03;

public abstract class AbstractDisplay {
    //display 메서드에서 반복 횟수를 고정값(5)에서 조절 가능하도록 확장
    private int repeatCount; //반복 횟수 저장하는 필드 추가

    //기존 코드 호환성 유지
    public AbstractDisplay() {
        this.repeatCount = 5; //기본값 5로 초기화
    }
    public AbstractDisplay(int repeatCount) {
        this.repeatCount = repeatCount;
    }

    public abstract void open();
    public abstract void print();
    public abstract void close();

    // display는 AbstractDisplay에서 구현하는 메소드 
    public final void display() {
        open();
        for (int i = 0; i < repeatCount; i++) { //고정값 대신 필드값 사용
            print();
        }
        close();
    }
}

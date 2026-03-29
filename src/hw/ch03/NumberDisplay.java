package hw.ch03;

public class NumberDisplay extends AbstractDisplay {
    private int number; //반복 횟수 저장하는 필드 추가

    // 생성자 
    public NumberDisplay(int number) {
        super(); //기본 생성자 호출
        this.number = number;
    }

    public NumberDisplay(int number, int repeatCount) {
        super(repeatCount); //반복 횟수 설정하는 생성자 호출
        this.number = number;
    }

    @Override
    public void open() {
        System.out.println("<<Number>>"); 
    }

    @Override
    public void print() {
        System.out.println(number); //한 줄에 하나씩 출력
    }

    @Override
    public void close() {
        System.out.println("<<Number>>");
    }
  
}

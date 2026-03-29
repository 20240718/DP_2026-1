package hw.ch03;

public class CharDisplay extends AbstractDisplay {
    private char ch;

    // 생성자 
    public CharDisplay(char ch) {
        super(); //기본 생성자 호출
        this.ch = ch;
    }

    public CharDisplay(char ch, int repeatCount) {
        super(repeatCount); //반복 횟수 설정하는 생성자 호출
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}

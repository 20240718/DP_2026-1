package ch03.Sample;
//만약 인터페이스라면 다중 상속이 가능하여 확장에 유리하다
public abstract class AbstractDisplay { //부모 클래스
    // open, print, close는 하위 클래스에 구현을 맡기는 추상 메소드 
    public abstract void open();
    public abstract void print();
    public abstract void close();

    // display는 AbstractDisplay에서 구현하는 메소드 (추상 메소드 활용)
    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}

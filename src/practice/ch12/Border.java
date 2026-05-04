package practice.ch12;
//border클래스를 상속받으면 다 장식자이다.
public abstract class Border extends Display {
    protected Display display;             // 이 장식틀이 감싸는 '내용물'

    protected Border(Display display) { // 인스턴스 생성 시 '내용물'을 인수로 지정
        this.display = display;
    }
}

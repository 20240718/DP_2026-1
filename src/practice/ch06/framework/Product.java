package practice.ch06.framework;

//Product 인터페이스를 구현한 클래스는 clone() 메소드를 제공
public interface Product extends Cloneable { //복제 가능한 인터페이스를 상속받음
    public abstract void use(String s);
    public abstract Product createCopy(); //복제 메소드
}

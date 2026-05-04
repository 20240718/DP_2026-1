package ch06.Sample.framework;
//Cloneable 인터페이스를 상속

public interface Product { //인터페이스
    public abstract void use(String s);
    public abstract Product createCopy();
}

package practice.ch04.framework; //2개의 클래스로 실행됨

public abstract class Factory {
    public final Product create(String owner) { //실제로는 IDCard객체가 생성되지만 부모타입(Product)으로 받을 수 있다.
        Product p = createProduct(owner); //실제 제품 생성
        registerPro*duct(p); //생성된 제품을 등록
        return p; 
    }

    //구체적인 공장이 구현해야하는 메소드
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}

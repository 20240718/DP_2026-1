package ch04.Sample.framework; //2개의 클래스로 실행됨

public abstract class Factory {
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract Product createProduct(String owner); //default접근 제어자로 구현하면 하위 클래스에서 따로 구현하지 않아도 이 디폴트 구현이 실행된다. 
    
    protected abstract void registerProduct(Product product);
}

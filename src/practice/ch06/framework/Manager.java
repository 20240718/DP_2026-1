package practice.ch06.framework;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    //product는 부모 타입 -> 모든 종류의 product 객체를 관리할 수 있음
    private Map<String,Product> showcase = new HashMap<>(); //(key, value) 쌍을 관리하는 HashMap을 사용하여 프로토타입 객체를 저장)

    public void register(String name, Product prototype) {
        showcase.put(name, prototype);
    }

    public Product create(String prototypeName) {
        Product p = showcase.get(prototypeName); //등록할 떈 key를 이용해서 불러옴
        return p.createCopy();
    }
}

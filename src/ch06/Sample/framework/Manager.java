package ch06.Sample.framework;

import java.util.HashMap;
import java.util.Map;

public class Manager { //Product 인터페이스로 인스턴스 복제
    private Map<String,Product> showcase = new HashMap<>(); //key-value 쌍을 저장하고 관리하는 자료구조

    public void register(String name, Product prototype) {
        showcase.put(name, prototype);
    }
 
    public Product create(String prototypeName) { //복사본 반환
        Product p = showcase.get(prototypeName);
        return p.createCopy(); //등록된 제품을 복사본을 만든다
    }
    //MessageBox, UnderLinePen클래스의 이름이 전혀 나오지 않는다. -> 밀접한 관계를 가지지 않아 product와 manager를 구체적인 클래스와 상관없이 수정 가능하다.
}

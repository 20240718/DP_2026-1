package practice.ch17;

import java.util.ArrayList;
import java.util.List;

public abstract class NumberGenerator {
    // Observer: 부모 타입-> 모든 종류의 관찰자들을 저장ㅇ가능
    // 관찰 대상은 구체적으로 어떤 관찰자가 자신을 관찰하는지 모른다. 알필요없다 -> 느슨한 결합
    // Observer를 저장한다  
    private List<Observer> observers = new ArrayList<>();

    // Observer를 추가한다 
    public void addObserver(Observer observer) { //인자로 들어온 옵저버 추가
        observers.add(observer);
    }

    // Observer를 제거한다 
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    // Observer에 통지한다 
    public void notifyObservers() {
        for (Observer o: observers) {
            o.update(this); //통지함
        }
    }

    // 수를 취득한다 
    public abstract int getNumber();

    // 수를 생성한다 
    public abstract void execute();
}

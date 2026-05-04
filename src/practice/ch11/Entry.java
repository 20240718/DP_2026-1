package practice.ch11;

public abstract class Entry {
    // 이름을 얻는다
    public abstract String getName();

    // 크기를 얻는다 
    public abstract int getSize();

    // 목록을 표시한다
    public void printList() { //안자 없음
        printList(""); //자기 메소드 호출
    }

    // prefix를 앞에 붙여서 목록을 표시한다 
    protected abstract void printList(String prefix); //추상 메소드

    // 문자열 표시 
    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}

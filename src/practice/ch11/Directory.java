package practice.ch11;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {
    private String name;
    private List<Entry> directory = new ArrayList<>(); //컬렉션, 자식(엔트리)를 보관할 리스트, Entry: 부모 타입(디렉트리와 파일 모두 저장 가능)

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() { //자기 자식들(디렉토리라는 배열에 있음)의 크기를 모두 더함
        int size = 0;
        for (Entry entry: directory) { //형식 for(원소 변수: 컬렉션)
            size += entry.getSize(); //자식 엔트리의 크기를 얻어 size에 더한다
        }
        return size;
    }

    @Override
    protected void printList(String prefix) { //prefix: 상위 디렉토리까지의 경로
        System.out.println(prefix + "/" + this);
        for (Entry entry: directory) {
            entry.printList(prefix + "/" + name); //이전 경로에 자기 이름 붙임
        }
    }

    // 디렉터리 엔트리를 디렉터리에 추가한다
    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }
}

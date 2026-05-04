package hw.ch11;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {
    private String name;
    private List<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Entry entry: directory) {
            size += entry.getSize();
        }
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        for (Entry entry: directory) {
            entry.printList(prefix + "/" + name);
        }
    }

    public Entry add(Entry entry) {
        directory.add(entry);
        entry.setParent(this);
        return this;
    }

    @Override
    public List<Entry> search(String keyword) {
        List<Entry> result = new ArrayList<>();

        // 1. 자신의 이름에 keyword가 포함되어 있는지 검사
        if (name.contains(keyword)) {
            result.add(this);
        }

        // 2. 모든 자식의 search() 결과를 병합하여 반환 (재귀적 탐색)
        for (Entry entry : directory) {
            result.addAll(entry.search(keyword));
        }

        return result;
    }
}

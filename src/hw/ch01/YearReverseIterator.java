//출판연도 최신책부터 오래된 순으로 순회하는 iterator
package hw.ch01;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class YearReverseIterator implements Iterator<Book> {
    private List<Book> sortedbooks; //정렬된 책을 순서대로 담을 리스트
    private int index;

    public YearReverseIterator(BookShelf bookShelf) {
        this.sortedbooks = new ArrayList<>();
        // 책꽂이의 책들을 sortedbooks에 추가
        for (int i = 0; i < bookShelf.getLength(); i++) {
            sortedbooks.add(bookShelf.getBookAt(i));
        }
        // 출판연도를 기준으로 내림차순 정렬
        sortedbooks.sort((b1, b2) -> Integer.compare(b2.getYear(), b1.getYear()));
        this.index = sortedbooks.size() - 1; //정렬된 리스트의 마지막 요소부터 시작
    }

    @Override
    public boolean hasNext() {
        return index < sortedbooks.size(); //리스트의 크기보다 index가 작으면 다음 책이 있음
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException(); //더 이상 책이 없으면 예외를 던짐
        }
        Book book = sortedbooks.get(index); //현재 index에 있는 책을 꺼냄
        index--; //index를 감소시켜 다음 책으로 이동
        return book;
    }

}

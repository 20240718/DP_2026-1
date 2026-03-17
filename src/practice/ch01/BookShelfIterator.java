package practice.ch01;

import java.util.Iterator; //인터페이스, 제너릭(만들어 질때 Book이라는 원소 타입을 받기에)
import java.util.NoSuchElementException;

public class BookShelfIterator implements Iterator<Book> {
    private BookShelf bookShelf;
    private int index; //다음에 꺼낼 책의 위치를 저장하는 필드

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf; //자기가 돌아다닐 책꽂이를 저장하는 필드
        this.index = 0;
    }

    @Override
    public boolean hasNext() { //다음에 책이 있는지 여부 판단하는 메소드
        if (index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Book next() { //다음 책을 꺼내는 메소드
        if (!hasNext()) { //다음 책이 없다면 예외를 던짐
            throw new NoSuchElementException();
        }
        Book book = bookShelf.getBookAt(index); //반복자가 책꽂이에 접근
        index++;
        return book;
    }
}

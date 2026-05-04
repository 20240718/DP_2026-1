package ch01.Sample;

import java.util.Iterator;

public class BookShelf implements Iterable<Book> {
    private Book[] books;
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) { //index위치의 책 반환
        return books[index];
    }

    public void appendBook(Book book) { //책꽂이에 책을 추가한다
        this.books[last] = book;
        last++;
    }

    public int getLength() { //책의 개수
        return last;
    }

    @Override //인터페이스에 정의된 메소드 구현
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this); //this: 자신(책꽂이)을 생성자에 전달
    }
}

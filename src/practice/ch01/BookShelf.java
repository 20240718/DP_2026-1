package practice.ch01;

import java.util.Iterator;

public class BookShelf implements Iterable<Book> {
    //pubic class BookShelf {}
    private Book[] books;
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this); //인자를 책꽂이 자신(this)로 넘겨 반복자가 책꽂이에 접근
    }
}

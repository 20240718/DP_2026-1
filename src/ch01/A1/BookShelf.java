package ch01.A1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelf implements Iterable<Book> {
    private List<Book> books; //부모로 선언

    public BookShelf(int initialsize) {
        this.books = new ArrayList<>(initialsize); //부모로 선언헸기에 어떤 자식 객체든 만들수있다
    }

    public Book getBookAt(int index) {
        return books.get(index); //books[index]
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}

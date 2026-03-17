//지정한 장르의 책만 순회하는 iterator
package hw.ch01;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class GenreFilterIterator implements Iterator<Book> {
    private BookShelf bookShelf;
    private String targetGenre; //지정한 장르
    private int index;

    public GenreFilterIterator(BookShelf bookShelf, String targetGenre) {
        this.bookShelf = bookShelf; 
        this.targetGenre = targetGenre; //지정한 장르로 초기화
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        for (int i = index; i < bookShelf.getLength(); i++) {
            Book book = bookShelf.getBookAt(i); //책꽂이에서 i번째 책을 꺼냄
            if (targetGenre.equals(book.getGenre())) { //책의 장르가 지정한 장르와 같으면
                return true;
            }
        }
        return false;
    }

    @Override
    public Book next() {
        while (index < bookShelf.getLength()) { //책꽂이에서 책이 남아있는 동안 책을 꺼냄
            Book book = bookShelf.getBookAt(index);
            index++;
            if (targetGenre.equals(book.getGenre())) {
                return book;
            }
        }
        throw new NoSuchElementException(); //지정한 장르의 책이 더 이상 없으면 예외를 던짐
    }
}
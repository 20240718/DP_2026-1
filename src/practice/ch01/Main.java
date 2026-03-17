package practice.ch01;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        //책 테스트
        Book book = new Book(name: "Java Programming");
        System.out.println("Book name: "+book.getName());

        //책장 테스트
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book(name: "Java Programming"));
        bookShelf.appendBook(new Book(name: "Python Programming"));
        bookShelf.appendBook(new Book(name: "C++ Programming"));

        //책장에 있는 책 목록 출력
        //방법1: 책꽂이에 클라이언트가 직접 접근
        System.out.println("Book in the shelf: ");
        for (int i = 0; i < bookShelf.getLength(); i++) {
            System.out.println("- "+bookShelf.getBookAt(i).getName());
        }

        //방법2: 책꽂이에 반복자를 만들어서 책을 꺼냄
        System.out.println("Book in the shelf(using iterator): ");
        Iterator<Book> it = bookShelf.iterator(); //책꽂이에서 반복자를 얻음
        while (it.hasNext()) { //반복자에서 다음 책이 있는지 확인
            Sytem.out.println("- "+it.next().getName()); //반복자에서 다음 책을 꺼냄
        }

        //방법3: 책꽂이에 반복자를 만들어서 책을 꺼냄(확장 for문)
        System.out.println("Book in the shelf(using for-each): ");
        for (Book book: bookShelf) { //책꽂이에서 반복자를 얻어서 책을 꺼냄
            System.out.println("- "+book.getName());
        }
    }
}

package practice.ch01;

public class Book {
    private String name;
    private String genre; //장르
    private int year; //출판년도
    private double price; //가격
    
    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

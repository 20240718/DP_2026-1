package hw.ch01;

public class Book {
    private String name;
    private String genre; //장르
    private int year; //출판년도
    private double price; //가격
    
    public Book(String name) { //기존 생성자 그대로
        this.name = name;
    }

    public Book(String name, String genre, int year, double price) { //새 필드를 받는 생성자를 오버로딩으로 추가
        this.name = name;
        this.genre = genre;
        this.year = year;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    
 //getter 메서드도 추가
    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }
}

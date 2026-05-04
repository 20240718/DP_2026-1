package ch02.Sample1;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello"); 
        //Print인터페이스를 사용하면 구현 세부사항과 관계ㅓㅇㅄ이 메소드만 이용가능
        p.printWeak();
        p.printStrong();
    }
}

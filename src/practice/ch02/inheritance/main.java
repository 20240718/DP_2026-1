package practice.ch02.inheritance;

public class main {
    public static main(String[] args) {
        Banner banner = new Banner(string: "Hello World");
        banner.showWithParen();
        banner.showWithAster();

        //어댑터 사용
        System.out.println("===어댑터 사용===:");
        Print print = new PrintBannerAdapter01(string: "Hello World");
        print.printWeak();
        print.printStrong();
    }
}
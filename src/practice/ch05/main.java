package practice.ch05;

public class main {
    public static void main(String[] args) {
        //싱글톤 패턴 테스트
        //Singleton s1 = Singleton.getInstance(); 컴파일 에러
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);

        if(s2 ==s3) {
            System.out.println("s2와 s3는 같은 객체입니다.");
        } else {
            System.out.println("s2와 s3는 다른 객체입니다.");
        }
        //싱글톤2 테스트
        Singleton2 s4 = Singleton2.INSTANCE;
    }
}

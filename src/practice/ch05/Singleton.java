package practice.ch05;
//싱글톤 패턴 적용하기

public class Singleton {
  //(3)싱글톤 객체를 미리 만들어 Static 변수에 저장한다.
    private static Singleton singleton=new Singleton();
    
    //(1)생성자를 private로 한다.
    private Singleton() {
        System.out.println("싱글톤 인스턴스가 생성되었습니다.");
    }

    //(2)싱글톤 객체를 얻어가는 static 변수에 저장한다.
    public static Singleton getInstance() {
        return Singleton.singleton; // 기존 인스턴스를 반환
    }
}

package practice.ch05;

public enum Singleton2 { //enum클래스: 상수들만 모아논 클래스
    INSTANCE; //상수: 싱글턴2 타입 객체가 생성되어 저장됨

    public void hello() {
        System.out.println("싱글톤2의 객체 hello가 사용됩니다.");
    }
}

package practice.ch05.ex;
//싱글톤 패턴 적용하기

public class Singleton {
  //(3)싱글톤 객체를 미리 만들어 Static 변수에 저장한다.
    private static Singleton singleton=null;
    
    //(1)생성자를 private로 한다.
    private Singleton() {
        System.out.println("싱글톤 인스턴스가 생성되었습니다.");
        slowdown(); //생성시간이 오래걸리도록 대기하는 메소드 호출
    }

    //(2)싱글톤 객체를 얻어가는 static 변수에 저장한다.
    public static synchronized Singleton getInstance() { //동기화(synchronized): 여러 스레드가 동시에 접근할 때, 하나의 스레드만 접근하도록 함
        if (Singleton.singleton == null) {
            Singleton.singleton = new Singleton();
        }
        return Singleton.singleton; // 기존 인스턴스를 반환
    }

    private void slowdown() {
        try {
            Thread.sleep(1000); //1초 대기
        } catch (InterruptedException e) {
        }
    }
}

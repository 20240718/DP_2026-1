package practice.ch05.ex;

public class main extends Thread { //Thread클래스 상속
    public static void main(String[] args) {
        // 스레드 2개 생성
        Thread a= new main("Thread A");
        Thread b= new main("Thread B");
        Thread c= new main("Thread C");
        // 스레드 실행(거의 동시에 실행됨= 뭐가 먼저 실행되는지 알 수 없음)
        a.start();
        b.start();
        c.start();

    }

    @Override
    //Thread의 run()메소드 오버라이드
    //이 Thread가 실행할 코드
    public void run(){
        Singleton s = Singleton.getInstance(); //각 스레드가 getInstance()메소드를 호출함
        System.out.println(getName() + ": " + s); //각 스레드의 이름과 싱글톤 객체의 주소를 출력
    }

    public main(String name) {
        super(name); //Thread의 생성자 호출하여 스레드 이름 설정
    }
}

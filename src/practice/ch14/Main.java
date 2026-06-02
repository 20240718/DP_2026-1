package practice.ch14;

public class Main {
    public static void main(String[] args) {
        Trouble trouble = new Trouble(100);
        Support s1 = new NoSupport("no support");

        // 체인 연결
        s1.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);

        // 여러 트러블 발생
        for (int i = 0; i < 500; i += 33) {
            s1.support(new Trouble(i));
        }
    }
}

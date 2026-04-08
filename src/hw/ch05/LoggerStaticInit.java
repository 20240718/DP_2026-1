package hw.ch05;
import java.util.logging.Logger;
//구현이 간단하고 스레드 안전성이 보장된다.
//프로그램 시작 시 항상 생성되어 인스턴스를 사용하지 않아도 메모리 차지
public class LoggerStaticInit {
    private static final LoggerStaticInit instance = new LoggerStaticInit(); //즉시 객체 생성

    private StringBuilder logBuffer;

    private LoggerStaticInit() {
        System.out.println("[LoggerStaticInit] 인스턴스가 생성했습니다.");
        logBuffer = new StringBuilder();
    }

    public static LoggerStaticInit getInstance() {
        return instance;
    }

    public void log(String message) {
        logBuffer.append("[").append(System.currentTimeMillis()).append("]").append(message).append("\n");
        System.out.println("[LoggerStaticInit] " + message);
    }

    public String getLog() {
        return logBuffer.toString();
    }
}

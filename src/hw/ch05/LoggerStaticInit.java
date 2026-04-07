package hw.ch05;
//구현이 간단하고 스레드 안전성이 JVM 에 의해 보장됨
//getInstance() 호출 시 추가 검사 없음

//프로그램 시작 시 항상 생성되며 인스턴스를 사용하지 않더라도 메모리를 차지함
import java.util.logging.Logger;

public class LoggerStaticInit { //즉시 초기화
    private static final LoggerStaticInit instance = new LoggerStaticInit();

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

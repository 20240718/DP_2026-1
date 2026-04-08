package hw.ch05;

public class LoggerSynchronizedLazy {
  private static LoggerSynchronizedLazy instance; 
  private StringBuilder logBuffer = new StringBuilder(); //객체 생성
  private LoggerSynchronizedLazy() {} //외부에서 객체 생성 못함

  public static synchronized LoggerSynchronizedLazy getInstance() {
    if(instance == null) instance = new LoggerSynchronizedLazy();

    return instance;
  }

  public void log(String message) {
    logBuffer.append(message).append("\n");
    System.out.println("[LoggerSynchronizedLazy] " + message);
  }

  public String getLog(){
    return logBuffer.toString();
  }
}

package hw.ch05;

public enum LoggerEnum {
  INSTANCE; //유일한 인스턴스 선언
  private StringBuilder logBuffer = new StringBuilder();

  public void log(String message) {
    logBuffer.append(message).append("\n");
    System.out.println("[LoggerEnum] " + message);
  } //바로 출력하지 않고 버퍼에 저장
  
  public String getLog() {
    return logBuffer.toString();
  }
}

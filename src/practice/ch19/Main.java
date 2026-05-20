package practice.ch19;

public class Main {
  public static void main(String[] args) {
    SafeVarargs frame = new SafeVarargs("금고 경비 시스템");


      while (true) {
            for (int hour = 0; hour < 24; hour++) {
                frame.setClock(hour);   // 시간 설정 
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        }
    }
  
}

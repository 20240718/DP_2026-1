package hw.ch17;

public class RangeObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        int number = generator.getNumber(); // 현재 생성된 수
        String range;

        // number의 범위를 판정한다
        if (number >= 0 && number < 10) {
            range = "Low";
        } else if (number >= 10 && number < 20) {
            range = "Mid";
        } else {
            range = "High";
        }
        System.out.println("RangeObserver: [" + range + "] " + number);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
    }
  
}

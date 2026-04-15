package practice.ch10;

import java.util.Random; //난수 생성

public class WinningStrategy implements Strategy { //포함하고 있다
    private Random random;
    private boolean won = false;
    private Hand prevHand; //이전에 낸 손 기억

    public WinningStrategy(int seed) { //난수 생성
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (!won) { //이전에 졌다면
            prevHand = Hand.getHand(random.nextInt(3)); //손을 랜덤으로 냄
        }
        return prevHand; //이겼다면 그대로
    }

    @Override
    public void study(boolean win) {
        won = win; //승패 기록
    }
}

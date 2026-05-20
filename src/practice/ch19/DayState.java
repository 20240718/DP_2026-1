package practice.ch19;

public class DayState implements State {
    private static DayState singleton = new DayState();

    private DayState() {
    }

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) { //야간 시간이 되면 야간 상태로 전환
        if (hour < 9 || 17 <= hour) {
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("금고사용(주간)"); //기록만
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("비상벨(주간)"); //경비 센터에 연락함
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("일반 통화(주간)"); //경비 센터와 연락함
    }

    @Override
    public String toString() {
        return "[주간]";
    }
}

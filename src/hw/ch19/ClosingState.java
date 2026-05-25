package hw.ch19;

public class ClosingState implements State {
  private static ClosingState singleton = new ClosingState();
  private ClosingState() {
  }
  public static State getInstance() {
    return singleton;
  }

  @Override
  public void doClock(Context context, int hour) {
    if (hour < 17) { //17시 미만이면 주간으로 변경
      context.changeState(DayState.getInstance());
    } else if (hour >= 20) { //20시 이상이면 야간으로 변경
      context.changeState(NightState.getInstance());
    }
  }

  @Override
  public void doUse(Context context) {
    context.callSecurityCenter("call! 마감 금고 점검");
  } //마감 금고 점검 통보
  @Override
  public void doAlarm(Context context) {
    context.callSecurityCenter("call! 비상벨(마감)");
    context.changeState(UrgentState.getInstance());
  } //비상벨 작동 및 비상 상황 전환
  @Override
  public void doPhone(Context context) {
    context.recordLog("record... 퇴근 확인 통화(마감)");
  } //퇴근 확인 통화 기록
  @Override
  public String toString() {
    return "[마감]";
  } //상태 문자열
}

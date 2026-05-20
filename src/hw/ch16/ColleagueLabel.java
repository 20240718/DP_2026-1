package hw.ch16;
import java.awt.Color;
import java.awt.Label;

public class ColleagueLabel extends Label implements Colleague{
  private Mediator mediator;

  public ColleagueLabel(String text) { // Label의 생성자에서 문자열을 지정한다
    super(text);
  }

  //COlleague 인터페이스 구현
  @Override
  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  } // Mediator에서 활성/비활성을 지시한다

  @Override
  public void setColleagueEnabled(boolean enabled) {
    if(enabled){
      this.setText("● 로그인 가능");
      this.setForeground(Color.blue);
    }else{
      this.setText("● 로그인 불가");
      this.setForeground(Color.gray);
    }
  }//Mediator가 내리는 활성/비활성 지시를 받아서 자신의 상태를 바꾼다
}

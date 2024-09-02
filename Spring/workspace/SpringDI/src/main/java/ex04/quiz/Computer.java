package ex04.quiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Computer {
	
	//컴퓨터 클래스는 마우스,키보드, 모니터 의존적임
	//컴퓨터 클래스에 의존객체 자동주입 명령을 이용해서, 주입되도록 처리하고, Main에서 computerInfo메서드를 호출
	@Autowired
	@Qualifier("m") //객체 이름으로 연결
	private Mouse mouse;
	@Autowired
	@Qualifier("key")
	private Keyboard kb;
	@Autowired
	@Qualifier("moni")
	private Monitor monitor;
	
	public void computerInfo() {
		System.out.println("***컴퓨터 정보***");
		mouse.info();
		kb.info();
		monitor.info();
	}
	
}

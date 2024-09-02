package ex02.constructor;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		//자바문법
//		Hotel hotel = new Hotel(new Chef());
//		hotel.getChef().cooking();
		
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("application-context.xml");
		
		Hotel hotel = ctx.getBean("hotel", Hotel.class); //hotel이름의 Hotel클래스를 찾아줘
		hotel.getChef().cooking();
		
		
		
	}
}

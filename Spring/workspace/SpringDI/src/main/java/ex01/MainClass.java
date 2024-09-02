package ex01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		//자바방식
//		SpringTest test = new SpringTest();
//		test.hello();
		
		
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("application-context.xml");
				
		SpringTest test = ctx.getBean(SpringTest.class);
		test.hello();
		
		SpringTest test2 = ctx.getBean(SpringTest.class);
		
		
		System.out.println(test == test2);
		
		
		
		
		
		
		
		
	}
}

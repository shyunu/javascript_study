package ex02.setter;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("application-context.xml");
		
		
		MemberDAO dao = ctx.getBean("memberDAO", MemberDAO.class);
		
		MyDataSource ds = dao.getMyDataSource();
		System.out.println(ds.getUrl());
		System.out.println(ds.getUid());
		System.out.println(ds.getUpw());
		
		
		
	}
}

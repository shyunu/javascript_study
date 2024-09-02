package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

//컨트롤러 역할을 수행
@Controller
public class HomeController {
	
//	@RequestMapping("/test/aaa")
	public String home() {
		
		System.out.println("컨트롤러 지나가요~");
		
//		return "/WEB-INF/views/home.jsp";
		return "home"; //controller의 suffix의 value값이랑 합쳐진다
	}
	
	
}






//public class HomeController extends MultiActionController {
//
//	@Override
//	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
//			throws Exception {
//		
//		System.out.println("컨트롤러 까지 연결됨....");
//		
//		//요청분기......................
//		
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("data", "hell로 월드");
//		mv.setViewName("/WEB-INF/views/home.jsp");
//		
//		
//		return mv; //디스패쳐 서블릿으로 뷰에 대한경로와, Data에 대한 내용을 반환
//	}
//
//}

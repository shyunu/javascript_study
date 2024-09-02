package com.simple.basic.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.basic.command.MemberVO;

@Controller
@RequestMapping("/request") //이 컨트롤러의 모든 요청 경로 앞에 /request(그룹화시키기)
public class RequestController {

	//1번방법
	@RequestMapping("/req_ex01")
	public String ex01() {
			return "request/req_ex01"; //화면경로
	}
	
//	//2번방법 : void형은 들어온 요청 경로가 그대로 나가는 경로가 된다(화면경로)
//	@RequestMapping("/req_ex01")
//	public void ex01() {
//		
//	}
	
	//@RequestMapping(value = "/basic", method = RequestMethod.GET) //get방식만 허용한다.
	//@RequestMapping(value = "/basic", method = RequestMethod.POST) //post방식만 허용한다.
	//@RequestMapping("/basic") //get,post 모두 허용
	
	@RequestMapping({"/basic", "/basic2"})
	public String basic() {
		System.out.println("basic요청 실행됨");
		return null;
	}
	
//	@GetMapping("/basic3") //request mapping + get 메서드만 허용
	@PostMapping("/basic3") //request mapping + post 메서드만 허용
	public String basic3() {
		System.out.println("basic3요청 실행됨");
		return null;
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//ex02 화면요청
	@RequestMapping("/req_ex02")
	public String ex02() {
			return "request/req_ex02";
	}
	
	//request 객체로 값 받기
//	@RequestMapping(value = "/param", method = RequestMethod.POST)
//	public String param(HttpServletRequest request) {
//		
//		System.out.println( request.getParameter("id") );
//		System.out.println( request.getParameter("pw") );
//		System.out.println( request.getParameterValues("inter") );
//		
//		//잘 처리해서 결과화면으로
//		return "request/req_ex02_ok";
//	}
	
	//@RequestParam방식 - 반드시 값을 화면에서 넘겨야한다(필수)
	//@RequestParam방식
	//required = false 처리하면 값이 없더라도 통과하게 된다.
//	@RequestMapping(value = "/param", method = RequestMethod.POST)
//	public String param( @RequestParam("id") String x,
//								  @RequestParam("pw") String y,
//								  @RequestParam(value = "inter", required = false, defaultValue = "") ArrayList<String> list) { //@RequestParam("request태그의 name") => id를 받아서 x로 맵핑
//		
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(list);
//		
//		return "request/req_ex02_ok";
//	}
	
	
	@RequestMapping(value = "/param", method = RequestMethod.POST)
	public String param( MemberVO vo ) { //MemberVO로 자동맵핑
		
		System.out.println(vo.toString());
		
		return "request/req_ex02_ok";
	}
}












package com.simple.basic.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.basic.command.MemberVO;

@Controller
@RequestMapping("/response")
public class ResponseController {
	
	//화면요청
	@RequestMapping("/res_ex01")
	public String ex01() {
			return "response/res_ex01";
	}

	//화면요청
//	@RequestMapping("/res_ex02")
//	public String ex02(Model model) {
//			//request.setAttribute(키, 값)
//			model.addAttribute("data", "홍길동"); //data라는 키로 값을 홍길동을 실어간다
//			model.addAttribute("now", new Date());
//		
//			return "response/res_ex02";
//	}
	
	//modelAndView 전달자
	@RequestMapping("/res_ex02")
	public ModelAndView ex02() {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("data", "이순신"); //여기에 데이터를 담는다
		mv.addObject("now", new Date());
		mv.setViewName("response/res_ex02"); //화면에 대한 경로
		
		return mv;
		
	}
	
	//@ModelAttribute : request + model 의 합성어
	@RequestMapping("/res_ex03")
	public String ex03( @ModelAttribute("info") String info ) {
		
			System.out.println(info); //info라는 이름으로 데이터를 넘겨준다.
			
			return "response/res_ex03";
	}
	
	@RequestMapping("/res_ex04")
	public String ex04( @ModelAttribute("info") MemberVO vo ) { //vo로 맵핑하고 info로 넘긴다
		
			System.out.println(vo.toString());
		
			return "response/res_ex04";
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////
	//redirect ?
	//스프링의 기본 이동방식은 forward이다.
	//redirect는 다시 컨트롤러를 태우는 용도로 사용한다.
	
	@RequestMapping("/login")
	public String loginView() {
			return "response/login";
	}
	
	@RequestMapping(value = "/loginForm", method = RequestMethod.POST)
	public String loginForm( MemberVO vo,
									   RedirectAttributes ra ) {
		
			//id와 pw가 동일하면 로그인 성공
			String id = vo.getId();
			String pw = vo.getPw();
			
			if(id.equals(pw)) { //로그인 성공
					return "response/login_ok"; //이동
					
			} else { //로그인 실패
					//redirect를 보낼 때 1회성 휘발데이터로 데이터를 넘기는 방식을 제공해준다.
					ra.addAttribute("msg", "틀렸습니다?");
					return "redirect:/response/login"; //실패, redirect:/를 붙혀서 forward->redirect로 전환, 다시 위의 login리퀘스트 맵핑을 탄다
			}
		
			
	}
	
	
	
	
	
	
	
}

package com.simple.basic.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.basic.command.MemberVO;
import com.simple.basic.command.quiz01VO;
import com.simple.basic.command.quiz02VO;

@Controller
@RequestMapping("/quiz")
public class QuizController {
	
	/* quiz01 */
	//화면요청
		@RequestMapping("/quiz01")
		public String quiz01() {
				return "quiz/quiz01";
		}
		
		//폼요청(form action="join")
		@RequestMapping("/join")
		public String join( @ModelAttribute("vo") quiz01VO vo) {
				return "quiz/quiz01_ok";
		} 
		
		
		///////////////////////////////////////////
		/* quiz02 */
		@RequestMapping("/quiz02")
		public String quiz02() {
				return "quiz/quiz02";
		}
		
		@RequestMapping("/result")
		public String result() {
				return "quiz/result";
		} 
		
		@RequestMapping("/birthForm")
		public String birthdayForm(  @RequestParam("year") String year,
													@RequestParam("month") String month,
													@RequestParam("day") String day,
													@RequestParam("msg") String msg,
													RedirectAttributes ra) {
			
			String str = year + "-" + month + "-" + day + "-" + msg;
			ra.addFlashAttribute("msg", str); //리다이렉트 시 1회 사용 가능
			
			return "redirect:/quiz/result"; //다시 컨트롤러를 태우는 것
			
		}
		
		
		
}

	






























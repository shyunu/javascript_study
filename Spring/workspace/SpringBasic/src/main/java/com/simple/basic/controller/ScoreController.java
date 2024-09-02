package com.simple.basic.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.basic.command.ScoreVO;
import com.simple.basic.service.score.ScoreService;
import com.simple.basic.service.score.ScoreServiceImpl;

@Controller
@RequestMapping("/service")
public class ScoreController {
	//	ScoreService service = new ScoreServiceImpl(); //1-2)멤버변수로 쓴다
	
	//impl 클래스를 bean으로 등록한다
	@Autowired
	@Qualifier("x") //serviceimpl의 @Service("x")와 값을 동일하게 적어준다
	ScoreService scoreService;
	
		//목록
	@RequestMapping("/scoreList")
		public String scoreList(Model model) {
		
		//select해서 model에 담아서 화면으로 ...
		ArrayList<ScoreVO> list = scoreService.getScore();
		model.addAttribute("list", list);
		
			return "service/scoreList";
		}
	
		//등록
	@RequestMapping("/scoreRegist")
		public String scoreRegist() {
			return "service/scoreRegist";
		}
	
		//폼요청
	@RequestMapping(value = "/scoreForm", method = RequestMethod.POST)
	public String scoreForm( ScoreVO vo ) { //vo로 값 받기
		
//		ScoreService service = new ScoreServiceImpl(); //1-1)지역변수말고 멤버변수로 쓰자! (위로 이동함)
		scoreService.regist(vo); //객체 생성하고 regist메서드 호출
		
		return "service/scoreResult"; //결과화면으로 이동
	}
	
	//삭제요청
	@RequestMapping("/deleteScore")
	public String deleteScore(@RequestParam("sno") int sno) {

		scoreService.delete(sno);
		
		return "redirect:/service/scoreList"; //다시 목록화면으로(redirect로 다시 태워서 보낸다)
	}
	
	
}



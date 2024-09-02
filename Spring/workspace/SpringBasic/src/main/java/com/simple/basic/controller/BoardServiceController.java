package com.simple.basic.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.basic.command.BoardVO;
import com.simple.basic.service.board.BoardService;

@Controller
@RequestMapping("/board")
public class BoardServiceController {

	@Autowired
	@Qualifier("k")
	BoardService boardService;
	
	//등록화면
	@RequestMapping("/boardRegister")
	public String boardRegister() {
		return "board/boardRegister";
		
	}
	
	//폼 태그 요청화면
	@RequestMapping(value = "/boardForm", method = RequestMethod.POST)
	public String boardForm( BoardVO vo) {
		boardService.regist(vo);
		return "board/boardResult";
		
	}
	
	//목록화면
	@RequestMapping("/boardList")
	public String boardList(Model model) {
		ArrayList<BoardVO> list = boardService.getBoard();
		model.addAttribute("list", list);

		return "board/boardList";
	}
	
	//삭제처리
	@RequestMapping("/boardDelete")
	public String boardDelete(@RequestParam("sno") int sno) {
		boardService.delete(sno);
		return "redirect:/board/boardList";
		
	}
}

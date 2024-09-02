package com.simple.basic.service.board;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.simple.basic.command.BoardVO;
import com.simple.basic.service.board.impl.BoardDAO;

@Service("k")
public class BoardServiceImpl implements BoardService {
	@Autowired
	@Qualifier("m")
	BoardDAO boardDAO;

	@Override
	public void regist(BoardVO vo) {
		boardDAO.regist(vo);
	}

	@Override
	public ArrayList<BoardVO> getBoard() {
		
		ArrayList<BoardVO> list = boardDAO.getBoard();
		return boardDAO.getBoard();
	}

	@Override
	public void delete(int sno) {
		boardDAO.delete(sno);
		
	}

}

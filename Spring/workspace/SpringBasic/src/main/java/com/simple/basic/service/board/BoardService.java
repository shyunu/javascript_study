package com.simple.basic.service.board;

import java.util.ArrayList;

import com.simple.basic.command.BoardVO;

public interface BoardService {
	public void regist ( BoardVO vo ); //등록
	public ArrayList<BoardVO> getBoard(); //조회
	public void delete(int sno); //삭제
}

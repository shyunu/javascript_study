package com.simple.basic.service.board.impl;

import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.simple.basic.command.BoardVO;

@Repository("m")
public class BoardDAOImpl implements BoardDAO {
	ArrayList<BoardVO> list = new ArrayList<>();
	@Autowired
	DataSource ds;
	
	@Override
	public void regist(BoardVO vo) {
			list.add(vo);
	}

	@Override
	public ArrayList<BoardVO> getBoard() {
		return list;
	}

	@Override
	public void delete(int sno) {
		list.remove(sno);
		
	}


}

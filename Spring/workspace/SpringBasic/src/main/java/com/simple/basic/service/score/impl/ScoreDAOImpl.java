package com.simple.basic.service.score.impl;

import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.simple.basic.command.ScoreVO;

@Repository("y")
public class ScoreDAOImpl implements ScoreDAO{

	//DB로 가정
//	ArrayList<ScoreVO> list = new ArrayList<>();
	@Autowired
	DataSource ds;
	
	@Override
	public void regist(ScoreVO vo) {
//		list.add(vo); //insert완료!
	}

	@Override
	public ArrayList<ScoreVO> getScore() {
//		return list;
		return null;
	}

	@Override
	public void delete(int sno) {
		
//		list.remove(sno); //인덱스번호로 삭제
		//remove작업
	}

}

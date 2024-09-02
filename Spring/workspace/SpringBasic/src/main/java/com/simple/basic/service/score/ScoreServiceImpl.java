package com.simple.basic.service.score;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.simple.basic.command.ScoreVO;
import com.simple.basic.service.score.impl.ScoreDAO;

@Service("x") //반드시 component-scan에 의하여 읽혀야 한다.(의존성 주입)
public class ScoreServiceImpl implements ScoreService {

//	@Autowired
//	@Qualifier("y")
//	ScoreDAO scoreDAO;
	
	@Autowired
	private ScoreMapper scoreMapper;
	@Override
	public void regist(ScoreVO vo) {
		System.out.println("regist메서드 동작");
		scoreMapper.regist(vo);
	}

	@Override
	public ArrayList<ScoreVO> getScore() {

//		ArrayList<ScoreVO> list = scoreDAO.getScore();

//		return list;
		System.out.println("getScore메서드 동작");
		return scoreMapper.getScore();
	}

	@Override
	public void delete(int sno) {
		System.out.println("delete메서드 동작");
		scoreMapper.delete(sno);
		
	}

}

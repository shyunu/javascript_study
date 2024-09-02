package com.simple.basic.service.score;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.simple.basic.command.ScoreVO;

@Mapper
public interface ScoreMapper {
	
	public void regist( ScoreVO vo ); //등록
	public ArrayList<ScoreVO> getScore(); //조회
	public void delete(int sno); //삭제
}

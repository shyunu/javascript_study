package com.simple.basic.command;

import java.util.ArrayList;

public class MemberVO { //value object ( = DTO와 비슷함)

	private String id;
	private String pw;
	private ArrayList<String> inter;
	
	//생성자 
	public MemberVO() {
		
	}

	public MemberVO(String id, String pw, ArrayList<String> inter) {
		super();
		this.id = id;
		this.pw = pw;
		this.inter = inter;
	}

	//toString
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pw=" + pw + ", inter=" + inter + "]";
	}

	//getter, setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public ArrayList<String> getInter() {
		return inter;
	}

	public void setInter(ArrayList<String> inter) {
		this.inter = inter;
	}
	
	
}

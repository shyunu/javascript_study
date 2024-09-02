package com.simple.basic.command;

public class BoardVO {
	
	private int sno;
	private String name;
	private String title;
	private String content;
	
	public BoardVO() {
		
	}

	public BoardVO(int sno, String name, String title, String content) {
		super();
		this.sno = sno;
		this.name = name;
		this.title = title;
		this.content = content;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	
	
}

package com.simple.basic.command;

public class quiz02VO {

	private String year;
	private String month;
	private String day;
	private String msg;
	
	public quiz02VO() {
		
	}


	public quiz02VO(String year, String month, String day, String msg) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
		this.msg = msg;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
}

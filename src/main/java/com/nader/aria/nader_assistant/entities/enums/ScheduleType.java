package com.nader.aria.nader_assistant.entities.enums;

public enum ScheduleType {

	UN_PLANING(1),
	PLANING(2),
	SPRINT(3);
	
	private int no;
	
	public int getNo() { return no; }
	
	private ScheduleType(int no) { this.no = no; }

}

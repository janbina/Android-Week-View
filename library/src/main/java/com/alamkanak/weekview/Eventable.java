package com.alamkanak.weekview;

import java.util.Calendar;

public interface Eventable{
	Calendar getStartTime();
	Calendar getEndTime();
	String getName();
	long getId();
	int getColor();
	Eventable copy();
	void setStartTime(Calendar time);
	void setEndTime(Calendar time);
}
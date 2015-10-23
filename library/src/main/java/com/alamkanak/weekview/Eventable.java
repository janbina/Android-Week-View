package com.alamkanak.weekview;

import android.content.Context;
import java.util.Calendar;

public interface Eventable{
	Calendar getStartTime();
    void setStartTime(Calendar time);
	Calendar getEndTime();
    void setEndTime(Calendar time);
	String getName(Context context);
	long getId();
	int getColor();
	Eventable copy();

}
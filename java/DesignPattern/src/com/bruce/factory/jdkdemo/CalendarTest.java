package com.bruce.factory.jdkdemo;

import java.time.ZoneId;
import java.util.Calendar;
import java.util.TimeZone;

public class CalendarTest {
	public static void main(String[] args) {
		//todo   more logics
         Calendar calendar=Calendar.getInstance();
         System.out.println("年:"+calendar.get(Calendar.YEAR));
         System.out.println("月:"+calendar.get(Calendar.MONTH));
         System.out.println("日:"+calendar.get(Calendar.MONDAY));
         System.out.println("时:"+calendar.get(Calendar.HOUR));
         System.out.println("分:"+calendar.get(Calendar.MINUTE));
         System.out.println("秒:"+calendar.get(Calendar.SECOND));
	}
}

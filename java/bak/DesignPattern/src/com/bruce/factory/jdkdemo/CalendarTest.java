package com.bruce.factory.jdkdemo;

import java.time.ZoneId;
import java.util.Calendar;
import java.util.TimeZone;

public class CalendarTest {
	public static void main(String[] args) {
		//todo   more logics
         Calendar calendar=Calendar.getInstance();
         System.out.println("��:"+calendar.get(Calendar.YEAR));
         System.out.println("��:"+calendar.get(Calendar.MONTH));
         System.out.println("��:"+calendar.get(Calendar.MONDAY));
         System.out.println("ʱ:"+calendar.get(Calendar.HOUR));
         System.out.println("��:"+calendar.get(Calendar.MINUTE));
         System.out.println("��:"+calendar.get(Calendar.SECOND));
	}
}

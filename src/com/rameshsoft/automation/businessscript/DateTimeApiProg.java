package com.rameshsoft.automation.businessscript;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeApiProg {
	public static void main(String[] args) {
		
		LocalDate localDate=LocalDate.now(); //today date
		System.out.println("today is:"+localDate);
		
		LocalDate yesDate=localDate.minusDays(1);//yes
		System.out.println("yesterday is:"+yesDate);
		
		LocalDate tommrw=localDate.plusDays(1);//tmrw
		System.out.println("tmrw is:"+tommrw);
		
		LocalTime localTime=LocalTime.now();//present time
		System.out.println(localTime);
		
		LocalTime localTime1=localTime.plusHours(2);
		System.out.println(localTime1);
		
		LocalTime localTime2=localTime.plusMinutes(30);
		System.out.println(localTime2);
		
		LocalTime localTime3=localTime.minusHours(1);
		System.out.println(localTime3);
		
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println(dateTime);
	}
	

}

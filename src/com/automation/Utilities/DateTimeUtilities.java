package com.automation.Utilities;

import java.time.LocalDate;

public class DateTimeUtilities {

	public static String getYMD() {
		LocalDate localDate= LocalDate.now();
		return localDate.toString();

	}
	public static int getCurrentDate() {
		String ymd=getYMD();
		String[] str=ymd.split("-");
		String date =str[2];//
		int curDate=Integer.parseInt(date);
		return curDate;
	}
	public static int getCurrentMonth() {
		String ymd=getYMD();
		String[] str=ymd.split("-");
		String month =str[1];//
		int curMonth=Integer.parseInt(month);
		return curMonth;
	}
	public static int getCurrentYear() {
		String ymd=getYMD();
		String[] str=ymd.split("-");
		String year =str[0];//
		int curYear=Integer.parseInt(year);
		return curYear;
	}
	public static LocalDate getFutureDate(int  noofDaysToAdd) {
		return LocalDate.now().plusDays(noofDaysToAdd);

}
	public static LocalDate getPastDate(int  noofDaysToSub) {
		return LocalDate.now().minusDays(noofDaysToSub);

}
	public static void main(String[] args) {
		System.out.println(getYMD());
		System.out.println(getCurrentYear());
		System.out.println(getCurrentMonth());
		System.out.println(getCurrentDate());
		System.out.println(getPastDate(30));
		System.out.println(getFutureDate(30));
		
	}

}
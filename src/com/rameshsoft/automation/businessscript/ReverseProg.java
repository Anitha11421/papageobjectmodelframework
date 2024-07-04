package com.rameshsoft.automation.businessscript;

public class ReverseProg {
	public static void main(String[] args) {
		String str="java hello selenium";
		StringBuilder sb=new StringBuilder(str);
		sb=sb.reverse();

		System.out.println("before reverse:"+str);
		System.out.println("aftr reverse:"+sb);
	}


}

package com.rameshsoft.automation.businessscript;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Findth_the_no_of_OccurencesofChar {
	public static void main(String[] args) {
		
		String str="java sele javaj";
		Pattern pattern=Pattern.compile("j");
		Matcher matcher= pattern.matcher(str);
		
		int charcount=0;
		while(matcher.find()) {
			charcount++;
			
			
		}
		System.out.println("no of occurences:"+charcount);
	}

}

package com.rameshsoft.automation.businessscript;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindCapitallettersProg {
	public static void main(String[] args) {
		String str="Java SeleNiumAA";
		
		Pattern pattern=Pattern.compile("[A-Z]");
		Matcher matcher=pattern.matcher(str);
		
		int charCount=0;
		while(matcher.find()) {
			charCount++;
			System.out.println(matcher.group());
		
		}
		System.out.println("charcount is:"+charCount);
		
	}

}

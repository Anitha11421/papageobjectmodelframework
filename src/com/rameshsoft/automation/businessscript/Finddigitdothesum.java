package com.rameshsoft.automation.businessscript;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Finddigitdothesum {
	public static void main(String[] args) {
		String str="adp123";
		
		Pattern pattern=Pattern.compile("[0-9]");
		Matcher matcher=pattern.matcher(str);
		
		int sum=0;
		while(matcher.find()) {
			String grp=matcher.group();
			int i=Integer.parseInt(grp);
			sum=sum+i;
	}
		System.out.println("sum is:"+sum);
		
	}

}

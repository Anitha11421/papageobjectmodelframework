package com.rameshsoft.automation.businessscript;

public class StringsProg {
public static void main(String[] args) {
	String str1="java";
	String str2=str1.concat("job");
	

	System.out.println(str1);
	System.out.println(str2);
	
	System.out.println(str1.hashCode());
	System.out.println(str2.hashCode());
	
	System.out.println(str1.toString());
	System.out.println(str2.toString());
	
	if(str1==str2) {
		System.out.println("equal");
		
	}
	else {
		System.out.println("not equal");
	}
	
}
}

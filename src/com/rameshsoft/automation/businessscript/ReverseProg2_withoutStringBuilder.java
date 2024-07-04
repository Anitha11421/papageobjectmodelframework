package com.rameshsoft.automation.businessscript;

public class ReverseProg2_withoutStringBuilder {
	public static void main(String[] args) {
		
		String str="practice";
		 String reverse="";
		 
		 for(int i=str.length()-1;i>=0;i--) {
			 reverse=reverse+str.charAt(i);
			
		 }
		System.out.println("before reverse:     "+str);
		System.out.println("after reverse:    "+reverse);
		

	}
	
}

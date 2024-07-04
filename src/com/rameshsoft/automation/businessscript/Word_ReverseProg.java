package com.rameshsoft.automation.businessscript;

public class Word_ReverseProg {
	public static void main(String[] args) {
		
		String str="java selenium job";
		
		String[] str1=str.split("\\s");
		String reverse="";
		for(String word:str1) {
			StringBuilder sb=new StringBuilder(word);
			sb.reverse();
			reverse=reverse+sb.toString()+" ";
			
		}
		System.out.println(reverse);
		
		
		
	}

}

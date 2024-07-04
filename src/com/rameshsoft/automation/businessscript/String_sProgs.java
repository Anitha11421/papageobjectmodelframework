package com.rameshsoft.automation.businessscript;

public class String_sProgs {
	public static void main(String[] args) {
		
		String str=" java ";
		
		String str1=str.toUpperCase();
		System.out.println(str1);
		
		String str2=str1.toLowerCase();
		System.out.println(str2);
		
		String str3=str.trim();
		System.out.println(str3);//java
		
		char ch=str3.charAt(2);
		System.out.println(ch);//v
		
		int i=str3.indexOf(1);
		System.out.println(i);//-1 why
		
		String str4=str3.replace("j", "J");//J
		System.out.println(str4);
		
		String str5=str3.replaceAll("Ja", "JAVA");
		System.out.println(str5);
		
		String str6="java selenium job";
		String[] str7=str6.split(str6);
		
		for(String str8:str7) {
			System.out.println(str8);
		}
		int i1=str6.compareTo("java");
		if(i1>=0) {
			System.out.println("Equal");
		}
		else {
			System.out.println("not equal");
		}
		
		char[] ch1=str6.toCharArray();
		for(char ch2:ch1) {
			System.out.println(ch2);
		}
		
		String str9=str6.concat("java");
		System.out.println(str9);
		
		boolean status=str6.contains("java");
		if(status) {
			System.out.println("its available");
		}
		else {
			System.out.println("not available");
		}
		
		
		
	}

}

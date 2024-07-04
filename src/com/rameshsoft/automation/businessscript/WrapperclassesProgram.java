package com.rameshsoft.automation.businessscript;

public class WrapperclassesProgram {
	public static void main(String[] args) {
		
		String str="456";
		
		int i=Integer.parseInt(str);
		System.out.println(i);            //456
		
		String str1="456.4565";
		
		double d=Double.parseDouble(str1);
		System.out.println(d);          //456.456
		
//		String str3="java"; //it is invalid number format exception
//		int i1=Integer.parseInt(str3);
//		System.out.println(i1);
		
		Integer i2=Integer.valueOf(i);
		System.out.println(i2);          //456
		
		
		
		int i4=Integer.valueOf(str);
		System.out.println(i4);         //456
		
		int i5=456;
		Integer i6= new Integer(i5);    //456
		System.out.println(i6);
		
		Integer i7=new Integer("91456");
		System.out.println(i7);       //91456
		
		int i8=i7;
		System.out.println(i8);       //91456
		
		Integer i9=i;                 //456
		System.out.println(i9);
		
		
	}

}

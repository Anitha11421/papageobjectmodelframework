package com.rameshsoft.automation.businessscript;

public class StrinBuilder_StringBuffer {
	public static void main(String[] args) {
	

	StringBuilder sb=new StringBuilder("java");
     StringBuilder sb1=sb.append("job");
     
     System.out.println(sb);
     System.out.println(sb1);
     
     System.out.println(sb.toString());
     System.out.println(sb1.toString());
     
     System.out.println(sb.hashCode());
     System.out.println(sb1.hashCode());
 	if(sb==sb1) {
 		System.out.println("equal");
 		
 	}
 	else {
 		System.out.println("not equal");
 	}
	

}
}
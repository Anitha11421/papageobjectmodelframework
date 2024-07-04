package com.rameshsoft.automation.businessscript;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeApi {
	public static void main(String[] args) {
		
		LocalDateTime localDateTime=LocalDateTime.now();
	     System.out.println("Before formatting:"+localDateTime);
		
	    
	    DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
	    
	    String formatedDate=localDateTime.format(formatter);
	    System.out.println("After formatting:"+formatedDate);
	
	
	
	
	}

}

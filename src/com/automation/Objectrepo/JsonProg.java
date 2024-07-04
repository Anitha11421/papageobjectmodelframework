package com.automation.Objectrepo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonProg {
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		JSONParser parser=new JSONParser();
		Object obj =parser.parse(new FileReader("F:\\march830pmbatch\\pageobjectmodelfw\\src\\com\\automation\\Objectrepo\\or.json")); 
		JSONObject jsonObject=(JSONObject) obj;
		
		String str1=(String) jsonObject.get("name");
		System.out.println("name="+str1);
		
		String str2=(String) jsonObject.get("course");
		System.out.println("course="+str2);
		
		String str3=(String) jsonObject.get("hardwork");
		System.out.println("hardwork="+str3);
		
		//get only keys
		Set setKeys=jsonObject.keySet();
		System.out.println(setKeys);
		
		//get all keys and values
		
		Set entries=jsonObject.entrySet();
		System.out.println(entries);
		
		
		
	}

}

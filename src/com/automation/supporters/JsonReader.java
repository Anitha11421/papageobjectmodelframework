package com.automation.supporters;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.automation.customisedExceptions.FrameworkException;

public class JsonReader {
	private String filePath;
	private JSONParser parser;
	private JSONObject jsonObject;
	private String value;

	public JsonReader(String filePath) throws FileNotFoundException, IOException, ParseException {
		this.filePath=filePath;
		Object obj=parser.parse(new FileReader(filePath));
		jsonObject=(JSONObject)obj;
	}
	public String getKey(String key) throws FrameworkException {
		if(jsonObject!=null) {
			value=(String) jsonObject.get(key);

		}
		else {
			//throw exception
			System.out.println("jsonObject is pointing to null");
			FrameworkException exception=new FrameworkException("jsonObject is pointing to null");
			throw exception;
		}
		return value;

	}
	public String getKey(String key,String defaultValue) {
		if(jsonObject!=null) {
			value=(String) jsonObject.getOrDefault(key, defaultValue);
			if(value==null) {
				value=defaultValue;
			}
		}
		else {
			//throw exception
			System.out.println("jsonObject is pointing to null");
		}
		return value;

	}
	public Set getAllKeys() {
		Set setKeys=null;

		if(jsonObject!=null) {
			setKeys=jsonObject.keySet();

		}
		else {
			//throw exception
			System.out.println("jsonObject is pointing to null");
		}
		return setKeys;

	}
	public List getAllValues() {
		List list=new ArrayList<>();
		if(jsonObject!=null) {
			Set setKeys=jsonObject.keySet();
			for(Object obj:setKeys) {
				Object val=jsonObject.get(obj);
				list.add(val);
			}
		}
		else {
			//throw exception
			System.out.println("jsonObject is pointing to null");
		}
		return list;
	}
	public Map getKeyValues() {
		Map map=new HashMap();
		if(jsonObject!=null) {
			Set setKeys=jsonObject.keySet();
			for(Object obj:setKeys) {
				Object val=jsonObject.get(obj);
				map.put(obj, val);
			}
		}
		else {
			//throw exception
			System.out.println("jsonObject is pointing to null");
		}
		return map;

	}
}



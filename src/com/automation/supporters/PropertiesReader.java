package com.automation.supporters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.automation.customisedExceptions.FrameworkException;

public class PropertiesReader {
	private String filePath;
	private FileInputStream fileInputStream;
	private Properties properties;
	private String value;
	
	public PropertiesReader(String filePath) throws IOException {
		
		this.filePath=filePath;
		fileInputStream=new FileInputStream(filePath);
		properties=new Properties();
		properties.load(fileInputStream);
		
	}
	public String getValue(String key) throws FrameworkException {
		if(properties!=null) {
			value=properties.getProperty(key);
			
		}
		else {
			//throw exception
			System.out.println("properties Object is pointing to null");
			FrameworkException exception=new FrameworkException("properties Object is pointing to null");
			throw exception;
		}
		return value;
	}
	public String getValue(String key,String defaultvalue) {
		if(properties!=null) {
			value=properties.getProperty(key);
			if(value==null) {
				value=defaultvalue;
			}
			
		}
		else {
			//throw exception
			System.out.println("properties pointing to null");
		}
		return value;
	}
	public String getValue(Object key) {
		if(properties!=null) {//--------------------------------------------------
			value=(String) properties.get(key);
			
		}
		else {
			//throw exception
			System.out.println("properties pointing to null");
		}
		return value;
	}
	public String getValue(Object key,Object defaultvalue) {
		if(properties!=null) {
			value=(String) properties.getOrDefault(key,defaultvalue);
			if(value==null) {
				value=(String) defaultvalue;
			}
			
		}
		else {
			//throw exception
			System.out.println("properties pointing to null");
		}
		return value;
	}
	
	public void writeKeyValue(String key,String value) throws FileNotFoundException, IOException {
		if(properties!=null) {
			properties.setProperty(key, value);//--------------------------------
			properties.store(new FileOutputStream(filePath), "file is saved successfully");
			
		}
		else {
			//throw exception
			System.out.println("Properties object is pointing to null  ");
		}
		
	}
	public void writeKeyValue(Object key,Object value) throws FileNotFoundException, IOException {
		if(properties!=null) {
			properties.put(key, value);
			properties.store(new FileOutputStream(filePath), "file is saved successfully");
			
		}
		else {
			//throw exception
			System.out.println("Properties object is pointing to null  ");
		}
		
	}
	public Set getKeySet() {
		Set setKeys=null;
		if(properties!=null) {
			 setKeys=properties.keySet();
		
		}
		else {
			//throw exception
			System.out.println("Properties object is pointing to null  ");
		}
		return setKeys;
	
	}
	public List getAllValues() {
		List listKeys=new ArrayList<>();
		if(properties!=null) {
			Set setKeys= properties.keySet();
			for(Object obj :setKeys) {
				Object value=properties.get(obj);
				listKeys.add(value);
			}
		}
		else {
			//throw exception
			System.out.println("Properties object is pointing to null  ");
		}
		return listKeys;
	
	}
	public Map getKeysValues() {
		Map map=new HashMap();
		if(properties!=null) {
			 Set setKeys=properties.keySet();
			 for(Object obj:setKeys) {
				 Object value=properties.get(obj);
				 map.put(obj, value);
			 }
		}
		else {
			//throw exception
			System.out.println("Properties object is pointin to null");

	}
		return map;
	}	
}

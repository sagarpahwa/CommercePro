package com.shipping.gts.pb.pbshipping.acc.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.StringTokenizer;
/**
 * 
 * @author AM006SO
 *
 */
public class ClientPropertyUtil {
	
	private static Properties properties;
	private static String METHODFILE = "/config.properties";
	static{
		properties = new Properties();
		try {	
			properties.load(ClientPropertyUtil.class.getResourceAsStream(METHODFILE));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static String getProperty(String property_name){
		return properties.getProperty(property_name);
	}
	
	public static List<String> convertPropertyToList(String property_name){
		List<String> str_list = new ArrayList<String>();
		StringTokenizer str = new StringTokenizer(getProperty(property_name),",");
		while(str.hasMoreElements()){
			str_list.add((String)str.nextElement());
		}
		return str_list;
	}
}

package com.shipping.gts.pb.pbshipping.acc.util;
/**
 * 
 * @author AM006SO
 *
 */
public class Constants {
	
	public static final String HTTP_POST="POST";
	public static final String HTTP_PUT="PUT";
	public static final String HTTP_GET="GET";
	public static final String HTTP_CONTENT_TYPE="Content-Type";
	public static final String HTTP_CONTENT_TYPE_JSON="application/json";
	public static final String HTTP_CONTENT_TYPE_URLENCODED="application/x-www-form-urlencoded";
	
	public static final String PROJECT_URL = ClientPropertyUtil.getProperty("acc.client.URL");
	public static final String AUTHENTCIATION_URL = ClientPropertyUtil.getProperty("acc.client.authentication.URL");
	public static final String AUTHENTCIATION_USERNAME = ClientPropertyUtil.getProperty("acc.client.authentication.USERNAME");
	public static final String AUTHENTCIATION_PASSWORD = ClientPropertyUtil.getProperty("acc.client.authentication.PASSWORD");
	

}

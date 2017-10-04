package com.shipping.gts.pb.pbshipping.acc.util;
/**
 * 
 * @author AM006SO
 *
 */
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonConverter {

	public  static String convertObjectToJson(Object obj) {
		ObjectMapper obj_mapper = new ObjectMapper();
		String json_string = "";
		try {
			json_string = obj_mapper.writeValueAsString(obj);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return json_string;
	}

	public static PredRoot convertJsontoObject(String is ,Object obj) {
		ObjectMapper mapper = new ObjectMapper();
		try {

			// Convert JSON string from file to Object
			PredRoot result = mapper.readValue(is,
					PredRoot.class);
			return result;
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}

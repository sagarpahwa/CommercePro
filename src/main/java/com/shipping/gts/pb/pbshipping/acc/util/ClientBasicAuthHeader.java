package com.shipping.gts.pb.pbshipping.acc.util;

import android.util.Base64;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
/**
 * 
 * @author AM006SO
 *
 */
public class ClientBasicAuthHeader {

	public static String getAuthHeader() throws JsonParseException,
			JsonMappingException, IOException {
		String tokenType = null;
		String tokenValue = null;
		String authHeader = null;
		MultiValueMap<String, String> obj = new LinkedMultiValueMap<String, String>();
		obj.add("grant_type", "password");
		obj.add("username", "commercepro");
		obj.add("password", "commerce@123");
		/*
		obj.add("username", Constants.AUTHENTCIATION_USERNAME);
		obj.add("password", Constants.AUTHENTCIATION_PASSWORD);*/


		HttpHeaders headers = new HttpHeaders();
		headers.setCacheControl("no-cache");
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<MultiValueMap<String, String>>(
				obj, headers);

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.postForEntity(
				"https://oc-devint-cbs.ecommerce.pb.com/auth/token?realm=user", entity, String.class);
				//Constants.AUTHENTCIATION_URL, entity, String.class);

		if (response.getStatusCode() == HttpStatus.OK) {
			String responseBody = response.getBody();

			ObjectMapper mapper = new ObjectMapper();

			Map<String, Object> map = new HashMap<String, Object>();

			// convert JSON string to Map
			map = mapper.readValue(responseBody,
					new TypeReference<Map<String, String>>() {
					});

			tokenType = (String) map.get("token_type");
			tokenValue = (String) map.get("access_token");

		}
		/*
		 * byte[] encodedAuth = Base64.encodeBase64(auth .getBytes(Charset
		 * .forName("US-ASCII")));
		 */
		if (tokenType.equals("Bearer")) {
			authHeader = tokenType + " " + tokenValue;
		}

		return authHeader;
	}
}

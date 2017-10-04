package com.shipping.gts.pb.pbshipping.acc.service;



import static com.shipping.gts.pb.pbshipping.acc.util.Constants.HTTP_CONTENT_TYPE;
import static com.shipping.gts.pb.pbshipping.acc.util.Constants.HTTP_CONTENT_TYPE_JSON;
import static com.shipping.gts.pb.pbshipping.acc.util.Constants.HTTP_GET;
import static com.shipping.gts.pb.pbshipping.acc.util.Constants.HTTP_POST;
import static com.shipping.gts.pb.pbshipping.acc.util.Constants.HTTP_PUT;

import org.apache.commons.codec.binary.Base64;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

import com.shipping.gts.pb.pbshipping.dto.PredictionResult;
import com.shipping.gts.pb.pbshipping.acc.util.ClientBasicAuthHeader;
import com.shipping.gts.pb.pbshipping.acc.util.JsonConverter;
import com.shipping.gts.pb.pbshipping.acc.util.PredRoot;

public class ACCClientServiceCall {

	public static Map<String, Object> executePostUrl(String incomingUrl,
			String jsonInput) {

		Map<String, Object> output_map = null;

		HttpURLConnection conn;
		long time_in = System.currentTimeMillis();
		try {
			URL url = new URL(incomingUrl);
			System.out.println(url.toString());
			output_map = new HashMap<String, Object>();
			conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod(HTTP_POST);
			conn.setRequestProperty(HTTP_CONTENT_TYPE, HTTP_CONTENT_TYPE_JSON);
			conn.setRequestProperty("cache-control", "no-cache");
			String auth = "commercepro" + ":" + "commerce@123";
			byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")) );
			String authHeader = "Basic " + new String( encodedAuth );
			//String base64EncodedCredentials = "Basic " + Base64.encodeToString(
			//		("commercepro" + ":" + "commerce@123").getBytes(),
			//		Base64.NO_WRAP);
			conn.setRequestProperty("Authorization", authHeader);
					//ClientBasicAuthHeader.getAuthHeader());
			System.out.println("Input data : " + jsonInput);
			output_map.put("Input data:", jsonInput);
			OutputStream os = conn.getOutputStream();
			os.write(jsonInput.getBytes());
			os.flush();

			output_map.put("RESPONSE_CODE",
					Integer.toString(conn.getResponseCode()));
			output_map.put("RESPONSE_MESSAGE", conn.getResponseMessage());

			com.shipping.gts.pb.pbshipping.acc.util.PredRoot prdResult = new PredRoot();
			if (conn.getResponseCode() == 200) {

				BufferedReader in = new BufferedReader(new InputStreamReader(
						conn.getInputStream()));

				String inputLine;
				StringBuffer response = new StringBuffer();

				while ((inputLine = in.readLine()) != null) {
					response.append(inputLine);
				}
				in.close();

				// print result
				if (response != null) {

//					System.out.println(response.toString());
					prdResult = JsonConverter.convertJsontoObject(
							response.toString(), new PredRoot());
				}
			} else {
				int responsecode = conn.getResponseCode();
//				System.out.println("Error from ACC for response Code :"
//						+ conn.getResponseCode() + " responseMessage : "
//						+ conn.getResponseMessage());
				prdResult = new PredRoot();
				PredictionResult predictions = new PredictionResult();
				predictions.setAdditionalProperty(
						"responseCode_responseMessage", responsecode + "_"
								+ conn.getResponseMessage());
				prdResult.setPredictions(predictions);
			}
			output_map.put("RETURN", prdResult);
			conn.disconnect();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		long time_out = System.currentTimeMillis();
		System.out.println("Total Time taken in second for calling ACC COO classification service:" + (time_out - time_in)/1000);
		return output_map;
	}

	public Map<String, String> executePutUrl(String incomingUrl,
			String jsonInput) {

		Map<String, String> output_map = null;

		HttpURLConnection conn;
		long time_in = System.currentTimeMillis();
		try {
			URL url = new URL(incomingUrl);
			System.out.println(url.toString());
			output_map = new HashMap<String, String>();
			conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod(HTTP_PUT);
			conn.setRequestProperty(HTTP_CONTENT_TYPE, HTTP_CONTENT_TYPE_JSON);
			conn.setRequestProperty("Authorization",
					ClientBasicAuthHeader.getAuthHeader());
			System.out.println("Input data : " + jsonInput);
			output_map.put("Input data:", jsonInput);
			OutputStream os = conn.getOutputStream();
			os.write(jsonInput.getBytes());
			os.flush();

			output_map.put("RESPONSE_CODE",
					Integer.toString(conn.getResponseCode()));
			output_map.put("RESPONSE_MESSAGE", conn.getResponseMessage());

			BufferedReader br = new BufferedReader(new InputStreamReader(
					conn.getInputStream()));

			StringBuilder responseStrBuilder = new StringBuilder();
			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				responseStrBuilder.append(output);
			}
			output_map.put("RETURN", responseStrBuilder.toString());

			conn.disconnect();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		long time_out = System.currentTimeMillis();
		System.out.println("Time taken :" + (time_out - time_in));
		return output_map;
	}

	public Map<String, String> executeGetUrl(String incomingUrl,
			String jsonInput) {

		Map<String, String> output_map = null;

		HttpURLConnection conn;
		long time_in = System.currentTimeMillis();
		try {
			URL url = new URL(incomingUrl);
			System.out.println(url.toString());
			output_map = new HashMap<String, String>();
			conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod(HTTP_GET);
			conn.setRequestProperty(HTTP_CONTENT_TYPE, HTTP_CONTENT_TYPE_JSON);
			conn.setRequestProperty("Authorization",
					ClientBasicAuthHeader.getAuthHeader());
			/*
			 * output_map.put("Input data:", jsonInput); OutputStream os =
			 * conn.getOutputStream(); os.write(jsonInput.getBytes());
			 * os.flush();
			 */
			output_map.put("RESPONSE_CODE",
					Integer.toString(conn.getResponseCode()));
			output_map.put("RESPONSE_MESSAGE", conn.getResponseMessage());

			BufferedReader br = new BufferedReader(new InputStreamReader(
					(conn.getInputStream())));

			StringBuilder responseStrBuilder = new StringBuilder();
			String output;
//			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				responseStrBuilder.append(output);
			}
			output_map.put("RETURN", responseStrBuilder.toString());
			conn.disconnect();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		long time_out = System.currentTimeMillis();
		System.out.println("Time taken :" + (time_out - time_in));
		return output_map;
	}
}

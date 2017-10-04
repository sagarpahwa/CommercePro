package com.shipping.gts.pb.pbshipping.acc.service;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.shipping.gts.pb.pbshipping.dto.Attribute;
import com.shipping.gts.pb.pbshipping.dto.ClassifierInput;
import com.shipping.gts.pb.pbshipping.acc.service.ACCClientServiceCall;
import com.shipping.gts.pb.pbshipping.acc.util.Constants;
import com.shipping.gts.pb.pbshipping.acc.util.JsonConverter;
import com.shipping.gts.pb.pbshipping.acc.util.PredRoot;

public class ACCCOO_ORMServiceCall {

	public static void TestCOOORMCall(ClassifierInput inpubtObj) {
		ClassifierInput clsInput = inpubtObj;
		clsInput.setName("Baby Safety&Health Baby Monitors");
		clsInput.setMerchantID("EBAY_0001");

		clsInput.setPortOfEntry("PB_AU");
		List<Attribute> lstAttr = new ArrayList<Attribute>();
		Attribute atr = new Attribute();
		
		//COD 
		atr.setAttrName("cod");
		atr.setAttrValue("AU");
		lstAttr.add(atr);
		
		//Mandatory ebay ItemId to map CPE to ACC
		atr.setAttrName("ebayItemID");
		atr.setAttrValue("343434");
		lstAttr.add(atr);
		
		clsInput.setAttributes(lstAttr);

		predictHsCode(clsInput);
//		System.out.println(inpubtObj.toString());
	}

	public static PredRoot predictHsCode(Object obj) {
		URL url = null;
		PredRoot predResult = null;

		try {
			url = new URL("http://152.144.198.246:9090/prediction/services/v1/hscode/predict");

			//new URL(Constants.PROJECT_URL + "orm/restriction/predict");
			String jsonInput = JsonConverter.convertObjectToJson(obj);

			Map<String, Object> responseMap = ACCClientServiceCall
					.executePostUrl(url.toString(), jsonInput);
			if (responseMap != null) {
				predResult = (PredRoot) responseMap.get("RETURN");
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		return predResult;
	}

	public static PredRoot predictEccn(Object obj) {
		URL url = null;
		PredRoot predResult = null;

		try {
			url = new URL("http://152.144.198.246:9090/prediction/services/v1/eccn/predict");

			//new URL(Constants.PROJECT_URL + "orm/restriction/predict");
			String jsonInput = JsonConverter.convertObjectToJson(obj);

			Map<String, Object> responseMap = ACCClientServiceCall
					.executePostUrl(url.toString(), jsonInput);
			if (responseMap != null) {
				predResult = (PredRoot) responseMap.get("RETURN");
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		return predResult;
	}

	public static PredRoot predictCoo(Object obj) {
		URL url = null;
		PredRoot predResult = null;

		try {
			url = new URL("http://152.144.198.246:9090/prediction/services/v1/coo/predict");

			//new URL(Constants.PROJECT_URL + "orm/restriction/predict");
			String jsonInput = JsonConverter.convertObjectToJson(obj);

			Map<String, Object> responseMap = ACCClientServiceCall
					.executePostUrl(url.toString(), jsonInput);
			if (responseMap != null) {
				predResult = (PredRoot) responseMap.get("RETURN");
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		return predResult;
	}

}

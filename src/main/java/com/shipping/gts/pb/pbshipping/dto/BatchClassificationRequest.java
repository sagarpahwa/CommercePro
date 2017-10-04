package com.shipping.gts.pb.pbshipping.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * 
 * @author AM006SO
 *
 */

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "batchRequest", "callBackUrl" })
public class BatchClassificationRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2335207792766252212L;
	
	@JsonProperty("batchRequest")
	private List<ClassifierInput> batchRequest = new ArrayList<ClassifierInput>();
	@JsonProperty("callBackUrl")
	private String callBackUrl;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 *
	 * @return The batchRequest
	 */
	@JsonProperty("batchRequest")
	public List<ClassifierInput> getBatchRequest() {
		return batchRequest;
	}

	/**
	 *
	 * @param batchRequest
	 *            The batchRequest
	 */
	@JsonProperty("batchRequest")
	public void setBatchRequest(List<ClassifierInput> batchRequest) {
		this.batchRequest = batchRequest;
	}

	/**
	 *
	 * @return The callBackUrl
	 */
	@JsonProperty("callBackUrl")
	public String getCallBackUrl() {
		return callBackUrl;
	}

	/**
	 *
	 * @param callBackUrl
	 *            The callBackUrl
	 */
	@JsonProperty("callBackUrl")
	public void setCallBackUrl(String callBackUrl) {
		this.callBackUrl = callBackUrl;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
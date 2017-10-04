package com.shipping.gts.pb.pbshipping.dto;

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

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "message", "parameters", "error" })
public class RestError {

	@JsonProperty("message")
	private String message;
	@JsonProperty("parameters")
	private List<String> parameters ;
	@JsonProperty("error")
	private Long error;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The message
	 */
	@JsonProperty("message")
	public String getMessage() {
		return message;
	}

	/**
	 * 
	 * @param message
	 *            The message
	 */
	@JsonProperty("message")
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * 
	 * @return The parameters
	 */
	@JsonProperty("parameters")
	public List<String> getParameters() {
		return parameters;
	}

	/**
	 * 
	 * @param parameters
	 *            The parameters
	 */
	@JsonProperty("parameters")
	public void setParameters(List<String> parameters) {
		this.parameters = parameters;
	}

	/**
	 * 
	 * @return The error
	 */
	@JsonProperty("error")
	public Long getError() {
		return error;
	}

	/**
	 * 
	 * @param error
	 *            The error
	 */
	@JsonProperty("error")
	public void setError(Long error) {
		this.error = error;
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

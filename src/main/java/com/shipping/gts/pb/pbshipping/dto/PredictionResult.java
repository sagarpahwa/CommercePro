package com.shipping.gts.pb.pbshipping.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "packageVersion", "predictionTime", "prdResult" })
public class PredictionResult {

	@JsonProperty("packageVersion")
	private Long packageVersion;
	
	@JsonProperty("predictionTime")
	private Long predictionTime;
	
	@JsonProperty("prdResult")
	private List<PrdResult> prdResult = new ArrayList<PrdResult>();
	
	@JsonProperty("transID")
	private String transID;
	
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	/**
	 *
	 * @return The packageVersion
	 */
	@JsonProperty("packageVersion")
	public Long getPackageVersion() {
		return packageVersion;
	}

	/**
	 *
	 * @param packageVersion
	 *            The packageVersion
	 */
	@JsonProperty("packageVersion")
	public void setPackageVersion(Long packageVersion) {
		this.packageVersion = packageVersion;
	}

	/**
	 *
	 * @return The predictionTime
	 */
	@JsonProperty("predictionTime")
	public Long getPredictionTime() {
		return predictionTime;
	}

	/**
	 *
	 * @param predictionTime
	 *            The predictionTime
	 */
	@JsonProperty("predictionTime")
	public void setPredictionTimeTime(Long predictionTime) {
		this.predictionTime = predictionTime;
	}

	/**
	 *
	 * @return The prdResult
	 */
	@JsonProperty("prdResult")
	public List<PrdResult> getPrdResult() {
		return prdResult;
	}

	/**
	 *
	 * @param prdResult
	 *            The prdResult
	 */
	@JsonProperty("prdResult")
	public void setPrdResult(List<PrdResult> prdResult) {
		this.prdResult = prdResult;
	}

	/**
	 * @return the transID
	 */
	public String getTransID() {
		return transID;
	}

	/**
	 * @param transID the transID to set
	 */
	public void setTransID(String transID) {
		this.transID = transID;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
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
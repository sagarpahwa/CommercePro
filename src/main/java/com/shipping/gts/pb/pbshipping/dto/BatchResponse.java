package com.shipping.gts.pb.pbshipping.dto;

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

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "success", "failed", "processingTime", "successRequests",
		"failedRequests", "batchId" })
public class BatchResponse {

	@JsonProperty("success")
	private List<Predictions> success = new ArrayList<Predictions>();
	@JsonProperty("failed")
	private List<Failed> failed = new ArrayList<Failed>();
	@JsonProperty("processingTime")
	private Long processingTime;
	@JsonProperty("successRequests")
	private Long successRequests;
	@JsonProperty("failedRequests")
	private Long failedRequests;
	@JsonProperty("batchId")
	private String batchId;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 *
	 * @return The success
	 */
	@JsonProperty("success")
	public List<Predictions> getSuccess() {
		return success;
	}

	/**
	 *
	 * @param success
	 *            The success
	 */
	@JsonProperty("success")
	public void setSuccess(List<Predictions> success) {
		this.success = success;
	}

	/**
	 *
	 * @return The failed
	 */
	@JsonProperty("failed")
	public List<Failed> getFailed() {
		return failed;
	}

	/**
	 *
	 * @param failed
	 *            The failed
	 */
	@JsonProperty("failed")
	public void setFailed(List<Failed> failed) {
		this.failed = failed;
	}

	/**
	 *
	 * @return The processingTime
	 */
	@JsonProperty("processingTime")
	public Long getProcessingTime() {
		return processingTime;
	}

	/**
	 *
	 * @param processingTime
	 *            The processingTime
	 */
	@JsonProperty("processingTime")
	public void setProcessingTime(Long processingTime) {
		this.processingTime = processingTime;
	}

	/**
	 *
	 * @return The successRequests
	 */
	@JsonProperty("successRequests")
	public Long getSuccessRequests() {
		return successRequests;
	}

	/**
	 *
	 * @param successRequests
	 *            The successRequests
	 */
	@JsonProperty("successRequests")
	public void setSuccessRequests(Long successRequests) {
		this.successRequests = successRequests;
	}

	/**
	 *
	 * @return The failedRequests
	 */
	@JsonProperty("failedRequests")
	public Long getFailedRequests() {
		return failedRequests;
	}

	/**
	 *
	 * @param failedRequests
	 *            The failedRequests
	 */
	@JsonProperty("failedRequests")
	public void setFailedRequests(Long failedRequests) {
		this.failedRequests = failedRequests;
	}

	/**
	 *
	 * @return The batchId
	 */
	@JsonProperty("batchId")
	public String getBatchId() {
		return batchId;
	}

	/**
	 *
	 * @param batchId
	 *            The batchId
	 */
	@JsonProperty("batchId")
	public void setBatchId(String batchId) {
		this.batchId = batchId;
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
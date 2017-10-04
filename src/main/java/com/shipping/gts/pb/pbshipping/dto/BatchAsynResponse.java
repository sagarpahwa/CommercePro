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

//import com.pb.xbec.restexceptionlib.resource.GenericError;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "BatchId", "Status","errors" })
public class BatchAsynResponse {

	@JsonProperty("batchId")
	private String BatchId;
	@JsonProperty("status")
	private String Status;
	@JsonProperty("errors")
	private List<Error> lstGenericError;

	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 *
	 * @return The BatchId
	 */
	@JsonProperty("batchId")
	public String getBatchId() {
		return BatchId;
	}

	/**
	 *
	 * @param BatchId
	 *            The BatchId
	 */
	@JsonProperty("batchId")
	public void setBatchId(String BatchId) {
		this.BatchId = BatchId;
	}

	/**
	 *
	 * @return The Status
	 */
	@JsonProperty("status")
	public String getStatus() {
		return Status;
	}

	/**
	 *
	 * @param Status
	 *            The Status
	 */
	@JsonProperty("status")
	public void setStatus(String Status) {
		this.Status = Status;
	}

	
	/**
	 * @return the lstGenericError
	 */
	public List<Error> getLstGenericError() {
		return lstGenericError;
	}

	/**
	 * @param lstGenericError the lstGenericError to set
	 */
	public void setLstGenericError(List<Error> lstGenericError) {
		this.lstGenericError = lstGenericError;
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
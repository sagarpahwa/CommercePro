package com.shipping.gts.pb.pbshipping.dto;

import java.math.BigDecimal;
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
@JsonPropertyOrder({"coo","cooQuality", "hscode", "hscodeQualitySix", "hscodeQualityFull", 
		"weight", "weightQuality", "size", "sizeQuality","ECCN","restriction","restrictionQuality","attributes" })
public class PrdResult {

	@JsonProperty("hscode")
	private String hscode;

	@JsonProperty("hscodeQualityFull")
	private Double hscodeQualityFull;
	
	@JsonProperty("hscodeQualitySix")
	private Double hscodeQualitySix;
	
	@JsonProperty("weight")
	private BigDecimal weight;
	
	@JsonProperty("weightQuality")
	private Double weightQuality;
	
	@JsonProperty("size")
	private BigDecimal size;
	
	@JsonProperty("sizeQuality")
	private Double sizeQuality;
	
	@JsonProperty("ECCN")
	private String eccn;
	
	@JsonProperty("coo")
	private String coo;
	
	@JsonProperty("cooQuality")
	private Double cooQuality;
	
	@JsonProperty("restriction")
	private String restriction;
	
	@JsonProperty("restrictionQuality")
	private Double restrictionQuality;

	@JsonProperty("attributes")
	private List<Attribute> attributes = new ArrayList<Attribute>();
	
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	/**
	 *
	 * @return The hscode
	 */
	@JsonProperty("hscode")
	public String getHscode() {
		return hscode;
	}

	/**
	 *
	 * @param hscode
	 *            The hscode
	 */
	@JsonProperty("hscode")
	public void setHscode(String hscode) {
		this.hscode = hscode;
	}

	/**
	 *
	 * @return The hscodeQualityFull
	 */
	@JsonProperty("hscodeQualityFull")
	public Double getHscodeQualityFull() {
		return hscodeQualityFull;
	}

	/**
	 *
	 * @param hscodeQualityFull
	 *            The hscodeQualityFull
	 */
	@JsonProperty("hscodeQualityFull")
	public void setHscodeQualityFull(Double hscodeQualityFull) {
		this.hscodeQualityFull = hscodeQualityFull;
	}

	/**
	 *
	 * @return The hscodeQualitySix
	 */
	@JsonProperty("hscodeQualitySix")
	public Double getHscodeQualitySix() {
		return hscodeQualitySix;
	}

	/**
	 *
	 * @param hscodeQualitySix
	 *            The hscodeQualitySix
	 */
	@JsonProperty("hscodeQualitySix")
	public void setHscodeQualitySix(Double hscodeQualitySix) {
		this.hscodeQualitySix = hscodeQualitySix;
	}

	/**
	 *
	 * @return The weight
	 */
	@JsonProperty("weight")
	public BigDecimal getWeight() {
		return weight;
	}

	/**
	 *
	 * @param weight
	 *            The weight
	 */
	@JsonProperty("weight")
	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	/**
	 *
	 * @return The weightQuality
	 */
	@JsonProperty("weightQuality")
	public Double getWeightQuality() {
		return weightQuality;
	}

	/**
	 *
	 * @param weightQuality
	 *            The weightQuality
	 */
	@JsonProperty("weightQuality")
	public void setWeightQuality(Double weightQuality) {
		this.weightQuality = weightQuality;
	}

	/**
	 *
	 * @return The size
	 */
	@JsonProperty("size")
	public BigDecimal getSize() {
		return size;
	}

	/**
	 *
	 * @param size
	 *            The size
	 */
	@JsonProperty("size")
	public void setSize(BigDecimal size) {
		this.size = size;
	}

	/**
	 *
	 * @return The sizeQuality
	 */
	@JsonProperty("sizeQuality")
	public Double getSizeQuality() {
		return sizeQuality;
	}

	/**
	 *
	 * @param sizeQuality
	 *            The sizeQuality
	 */
	@JsonProperty("sizeQuality")
	public void setSizeQuality(Double sizeQuality) {
		this.sizeQuality = sizeQuality;
	}

	/**
	 *
	 * @return The Attribute
	 */
	@JsonProperty("attributes")
	public List<Attribute> getAttributes() {
		return attributes;
	}

	/**
	 *
	 * @param Attribute
	 *            The Attribute
	 */
	@JsonProperty("attributes")
	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}
	
	
	/**
	 * 
	 * @return ECCN
	 */
	@JsonProperty("eccn")
	public String getEccn() {
		return eccn;
	}

	/**
	 * 
	 * @param eccn
	 */
	@JsonProperty("eccn")
	public void setEccn(String eccn) {
		this.eccn = eccn;
	}

	@JsonProperty("coo")
	public String getCoo() {
		return coo;
	}
	
	@JsonProperty("coo")
	public void setCoo(String coo) {
		this.coo = coo;
	}

	/**
	 * @return the cooQuality
	 */
	@JsonProperty("cooQuality")
	public Double getCooQuality() {
		return cooQuality;
	}

	/**
	 * @param cooQuality the cooQuality to set
	 */
	@JsonProperty("cooQuality")
	public void setCooQuality(Double cooQuality) {
		this.cooQuality = cooQuality;
	}
	
	@JsonProperty("restriction")
	public String getRestriction() {
		return restriction;
	}
	
	@JsonProperty("restriction")
	public void setRestriction(String restriction) {
		this.restriction = restriction;
	}
	
	@JsonProperty("restrictionQuality")
	public Double getRestrictionQuality() {
		return restrictionQuality;
	}
	@JsonProperty("restrictionQuality")
	public void setRestrictionQuality(Double restrictionQuality) {
		this.restrictionQuality = restrictionQuality;
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
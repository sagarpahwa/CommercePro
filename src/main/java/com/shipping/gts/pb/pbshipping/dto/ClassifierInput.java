package com.shipping.gts.pb.pbshipping.dto;

/**
 * 
 * @author AM006SO
 *
 */

import java.io.Serializable;
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
@JsonPropertyOrder({
    "name",
    "shortDescription",
    "longDescription",
    "brand",
    "categoryList",
    "retailerName",
    "attributes",
    "unitPrice",
    "merchantID",
    "portOfEntry",
    "listingType",
    "image"
})
public class ClassifierInput implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 2588540411897505517L;
	@JsonProperty("name")
    private String name;
    @JsonProperty("shortDescription")
    private String shortDescription;
    @JsonProperty("longDescription")
    private String longDescription;
    @JsonProperty("brand")
    private String brand;
    @JsonProperty("categoryList")
    private MerchantCategory merchantCategoryList;
    @JsonProperty("retailerName")
    private String retailerName;
    @JsonProperty("attributes")
    private List<Attribute> attributes = new ArrayList<Attribute>();
    @JsonProperty("unitPrice")
    private UnitPrice unitPrice;
    @JsonProperty("merchantID")
    private String merchantID;
    @JsonProperty("portOfEntry")
    private String portOfEntry;
    @JsonProperty("listingType")
    private String listingType;
    @JsonProperty("image")
    private byte[] image;
    private String transID;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The shortDescription
     */
    @JsonProperty("shortDescription")
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * 
     * @param shortDescription
     *     The shortDescription
     */
    @JsonProperty("shortDescription")
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    /**
     * 
     * @return
     *     The longDescription
     */
    @JsonProperty("longDescription")
    public String getLongDescription() {
        return longDescription;
    }

    /**
     * 
     * @param longDescription
     *     The longDescription
     */
    @JsonProperty("longDescription")
    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    /**
     * 
     * @return
     *     The brand
     */
    @JsonProperty("brand")
    public String getBrand() {
        return brand;
    }

    /**
     * 
     * @param brand
     *     The brand
     */
    @JsonProperty("brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 
     * @return
     *     The merchantCategoryList
     */
    @JsonProperty("categoryList")
    public MerchantCategory getMerchantCategoryList() {
        return merchantCategoryList;
    }

    /**
     * 
     * @param merchantCategoryList
     *     The merchantCategoryList
     */
    @JsonProperty("categoryList")
    public void setCategoryList(MerchantCategory merchantCategoryList) {
        this.merchantCategoryList = merchantCategoryList;
    }

   

    /**
     * 
     * @return
     *     The attributes
     */
    @JsonProperty("attributes")
    public List<Attribute> getAttributes() {
        return attributes;
    }

    /**
     * 
     * @param attributes
     *     The attributes
     */
    @JsonProperty("attributes")
    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    /**
     * 
     * @return
     *     The unitPrice
     */
    @JsonProperty("unitPrice")
    public UnitPrice getUnitPrice() {
        return unitPrice;
    }

    /**
     * 
     * @param unitPrice
     *     The unitPrice
     */
    @JsonProperty("unitPrice")
    public void setUnitPrice(UnitPrice unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * 
     * @return
     *     The merchantID
     */
    @JsonProperty("merchantID")
    public String getMerchantID() {
        return merchantID;
    }

    /**
     * 
     * @param merchantID
     *     The merchantID
     */
    @JsonProperty("merchantID")
    public void setMerchantID(String merchantID) {
        this.merchantID = merchantID;
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

	/**
	 * @return the retailerName
	 */
	public String getRetailerName() {
		return retailerName;
	}

	/**
	 * @param retailerName the retailerName to set
	 */
	  @JsonProperty("retailerName")
	public void setRetailerName(String retailerName) {
		this.retailerName = retailerName;
	}

	/**
	 * @return the transID
	 */
	  @JsonProperty("transID")
	public String getTransID() {
		return transID;
	}

	/**
	 * @param transID the transID to set
	 */
	public void setTransID(String transID) {
		this.transID = transID;
	}

	/**
	 * @return the portOfEntry
	 */
	public String getPortOfEntry() {
		return portOfEntry;
	}

	/**
	 * @param portOfEntry the portOfEntry to set
	 */
	public void setPortOfEntry(String portOfEntry) {
		this.portOfEntry = portOfEntry;
	}

	/**
	 * @return the listingType
	 */
	public String getListingType() {
		return listingType;
	}

	/**
	 * @param listingType the listingType to set
	 */
	public void setListingType(String listingType) {
		this.listingType = listingType;
	}

	public byte[] getImage(){return image;}

    public void setImage(byte[] image){
        this.image = image;
    }

	
	
}

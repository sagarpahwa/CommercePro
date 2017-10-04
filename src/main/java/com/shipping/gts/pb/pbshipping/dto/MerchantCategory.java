package com.shipping.gts.pb.pbshipping.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
* merchantCategory
* <p>
* A category in a catalogue structure
* 
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"merchantCatRefId",
"merchantParCatRefId",
"name",
"parentsNames",
"parentsRefId",
"url",
"isLeaf"
})
public class MerchantCategory implements Serializable {

/**
	 * 
	 */
	private static final long serialVersionUID = 6703729233855814197L;
/**
* The merchant’s reference ID for the category
* (Required)
* 
*/
@JsonProperty("merchantCatRefId")
private String merchantCatRefId;
/**
* The category’s parent’s merchantCatRefId. If null, category is assumed to be root category.
* 
*/
@JsonProperty("merchantParCatRefId")
private String merchantParCatRefId;
/**
* The name of the category. This is required in the Category Feed.
* (Required)
* 
*/
@JsonProperty("name")
private String name;
/**
* The tree of parent names to reach this category. parentNames[0] must be the top level name. and parentNames[size-1] must be the name of the parent category containing this category. This will be used to validate the existence of parent categories and build the category name path, If category code name is already available, then only populate the first field of the array with the code
* 
*/
@JsonProperty("parentsNames")
private List<Object> parentsNames = new ArrayList<Object>();
/**
* The tree of parent category ref ids to reach to this category. This will be used to build the category code path. If category code path is already available, then only populate the first field of the array with the code
* 
*/
@JsonProperty("parentsRefId")
private List<Object> parentsRefId = new ArrayList<Object>();
/**
* The URL to the category. This is required in the Category Feed.
* 
*/
@JsonProperty("url")
private String url;
/**
* Defaults to false. This is a flag to indicate a leaf category to which a commodity may be associated.
* 
*/
@JsonProperty("isLeaf")
private Boolean isLeaf;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* The merchant’s reference ID for the category
* (Required)
* 
* @return
* The merchantCatRefId
*/
@JsonProperty("merchantCatRefId")
public String getMerchantCatRefId() {
return merchantCatRefId;
}

/**
* The merchant’s reference ID for the category
* (Required)
* 
* @param merchantCatRefId
* The merchantCatRefId
*/
@JsonProperty("merchantCatRefId")
public void setMerchantCatRefId(String merchantCatRefId) {
this.merchantCatRefId = merchantCatRefId;
}

/**
* The category’s parent’s merchantCatRefId. If null, category is assumed to be root category.
* 
* @return
* The merchantParCatRefId
*/
@JsonProperty("merchantParCatRefId")
public String getMerchantParCatRefId() {
return merchantParCatRefId;
}

/**
* The category’s parent’s merchantCatRefId. If null, category is assumed to be root category.
* 
* @param merchantParCatRefId
* The merchantParCatRefId
*/
@JsonProperty("merchantParCatRefId")
public void setMerchantParCatRefId(String merchantParCatRefId) {
this.merchantParCatRefId = merchantParCatRefId;
}

/**
* The name of the category. This is required in the Category Feed.
* (Required)
* 
* @return
* The name
*/
@JsonProperty("name")
public String getName() {
return name;
}

/**
* The name of the category. This is required in the Category Feed.
* (Required)
* 
* @param name
* The name
*/
@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

/**
* The tree of parent names to reach this category. parentNames[0] must be the top level name. and parentNames[size-1] must be the name of the parent category containing this category. This will be used to validate the existence of parent categories and build the category name path, If category code name is already available, then only populate the first field of the array with the code
* 
* @return
* The parentsNames
*/
@JsonProperty("parentsNames")
public List<Object> getParentsNames() {
return parentsNames;
}

/**
* The tree of parent names to reach this category. parentNames[0] must be the top level name. and parentNames[size-1] must be the name of the parent category containing this category. This will be used to validate the existence of parent categories and build the category name path, If category code name is already available, then only populate the first field of the array with the code
* 
* @param parentsNames
* The parentsNames
*/
@JsonProperty("parentsNames")
public void setParentsNames(List<Object> parentsNames) {
this.parentsNames = parentsNames;
}

/**
* The tree of parent category ref ids to reach to this category. This will be used to build the category code path. If category code path is already available, then only populate the first field of the array with the code
* 
* @return
* The parentsRefId
*/
@JsonProperty("parentsRefId")
public List<Object> getParentsRefId() {
return parentsRefId;
}

/**
* The tree of parent category ref ids to reach to this category. This will be used to build the category code path. If category code path is already available, then only populate the first field of the array with the code
* 
* @param parentsRefId
* The parentsRefId
*/
@JsonProperty("parentsRefId")
public void setParentsRefId(List<Object> parentsRefId) {
this.parentsRefId = parentsRefId;
}

/**
* The URL to the category. This is required in the Category Feed.
* 
* @return
* The url
*/
@JsonProperty("url")
public String getUrl() {
return url;
}

/**
* The URL to the category. This is required in the Category Feed.
* 
* @param url
* The url
*/
@JsonProperty("url")
public void setUrl(String url) {
this.url = url;
}

/**
* Defaults to false. This is a flag to indicate a leaf category to which a commodity may be associated.
* 
* @return
* The isLeaf
*/
@JsonProperty("isLeaf")
public Boolean getIsLeaf() {
return isLeaf;
}

/**
* Defaults to false. This is a flag to indicate a leaf category to which a commodity may be associated.
* 
* @param isLeaf
* The isLeaf
*/
@JsonProperty("isLeaf")
public void setIsLeaf(Boolean isLeaf) {
this.isLeaf = isLeaf;
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
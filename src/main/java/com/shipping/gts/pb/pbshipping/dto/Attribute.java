
package com.shipping.gts.pb.pbshipping.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.ToStringBuilder;
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
@JsonPropertyOrder({ "name", "value" })
public class Attribute implements Serializable {

//    @JsonProperty("test")
//    private String test;
    
    /**
	 * 
	 */
	private static final long serialVersionUID = -8056284234542572866L;
	
	@JsonProperty("name")
	private String name;
	@JsonProperty("value")
	private Object value;
	
    public String getAttrName() {
		return name;
	}

	public void setAttrName(String attName) {
		this.name = attName;
	}

	public Object getAttrValue() {
		return value;
	}

	public void setAttrValue(Object attValue) {
		this.value = attValue;
	}

	@JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

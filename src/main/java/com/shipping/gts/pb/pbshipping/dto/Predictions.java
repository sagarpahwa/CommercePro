package com.shipping.gts.pb.pbshipping.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;
/**
 * 
 * @author AM006SO
 *
 */

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({ "predictions" })
public class Predictions {
	
	@JsonProperty("predictions")
	private PredictionResult predictionResult;

	/**
	 * @return the predictionResult
	 */
	@JsonProperty("predictions")
	public PredictionResult getPredictionResult() {
		return predictionResult;
	}

	/**
	 * @param predictionResult the predictionResult to set
	 */
	@JsonProperty("predictions")
	public void setPredictionResult(PredictionResult predictionResult) {
		this.predictionResult = predictionResult;
	}
	
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	

}

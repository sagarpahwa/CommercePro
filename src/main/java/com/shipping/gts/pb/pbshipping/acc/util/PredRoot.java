package com.shipping.gts.pb.pbshipping.acc.util;
/**
 * 
 * @author AM006SO
 *
 */
import org.codehaus.jackson.annotate.JsonProperty;

import com.shipping.gts.pb.pbshipping.dto.PredictionResult;

public class PredRoot {


	@JsonProperty("predictions")
	private PredictionResult predictions;
	
	public PredictionResult getPredictions() {
		return this.predictions;
	}

	public void setPredictions(PredictionResult predictions) {
		this.predictions = predictions;
	}
}
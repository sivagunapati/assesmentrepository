package com.accenture.test.assesment.entites;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class FeatureId implements Serializable {
	
	@Column(name = "FEATURETYPE")
    private String featureType;
	
	@Column(name = "FEATUREDESCRIPTION")
    private String featureDescription;

	public String getFeatureType() {
		return featureType;
	}

	public void setFeatureType(String featureType) {
		this.featureType = featureType;
	}

	public String getFeatureDescription() {
		return featureDescription;
	}

	public void setFeatureDescription(String featureDescription) {
		this.featureDescription = featureDescription;
	}
	

}

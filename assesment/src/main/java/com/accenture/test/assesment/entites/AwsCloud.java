package com.accenture.test.assesment.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AWS_CLOUD")
public class AwsCloud {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
	private int id;
	
	@Column(name = "AWSFEATURE")
	private String awsFeature;
	
	@Column(name = "AWSFEATUREDESCRIPTION")	
	private String awsFeatureDescription;
	
	@Column(name = "FEATURETYPE")
	private String featureType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAwsFeature() {
		return awsFeature;
	}

	public void setAwsFeature(String awsFeature) {
		this.awsFeature = awsFeature;
	}

	public String getAwsFeatureDescription() {
		return awsFeatureDescription;
	}

	public void setAwsFeatureDescription(String awsFeatureDescription) {
		this.awsFeatureDescription = awsFeatureDescription;
	}

	public String getFeatureType() {
		return featureType;
	}

	public void setFeatureType(String featureType) {
		this.featureType = featureType;
	}

	@Override
	public String toString() {
		return "AwsCloud [id=" + id + ", awsFeature=" + awsFeature + ", awsFeatureDescription=" + awsFeatureDescription
				+ ", featureType=" + featureType + "]";
	}

}

package com.accenture.test.assesment.model;

public class Cloud {
	private String awsFeature;
	private String predixFeature;

	public Cloud() {

	}

	public Cloud(String awsFeature, String predixFeature) {
		super();
		this.awsFeature = awsFeature;
		this.predixFeature = predixFeature;
	}

	public String getAwsFeature() {
		return awsFeature;
	}

	public void setAwsFeature(String awsFeature) {
		this.awsFeature = awsFeature;
	}

	public String getPredixFeature() {
		return predixFeature;
	}

	public void setPredixFeature(String predixFeature) {
		this.predixFeature = predixFeature;
	}

}

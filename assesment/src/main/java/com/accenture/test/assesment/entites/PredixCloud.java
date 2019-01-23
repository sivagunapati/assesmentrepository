package com.accenture.test.assesment.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PREDIX_CLOUD")
public class PredixCloud {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
	private Integer id;
	
	@Column(name = "PREDIXFEATURE")
	private String predixFeature;
	
	@Column(name = "PREDIXFEATUREDESCRIPTION")
	private String predixFeatureDescription;
	
	@Column(name = "FEATURETYPE")
	private String featureType;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPredixFeature() {
		return predixFeature;
	}

	public void setPredixFeature(String predixFeature) {
		this.predixFeature = predixFeature;
	}

	public String getPredixFeatureDescription() {
		return predixFeatureDescription;
	}

	public void setPredixFeatureDescription(String predixFeatureDescription) {
		this.predixFeatureDescription = predixFeatureDescription;
	}

	public String getFeatureType() {
		return featureType;
	}

	public void setFeatureType(String featureType) {
		this.featureType = featureType;
	}

	@Override
	public String toString() {
		return "PredixCloud [id=" + id + ", predixFeature=" + predixFeature + ", predixFeatureDescription="
				+ predixFeatureDescription + ", featureType=" + featureType + "]";
	}

	
}

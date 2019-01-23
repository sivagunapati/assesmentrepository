package com.accenture.test.assesment.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class CustomerModel {

	private int custId;
	private String customerName;
	private int active;
	private String emailAddress;
	private String mobileNumber;
	private String phoneNumber;
	private String state;
	private String country;
	private String language;
	
	private BusinessProblemModel businessProblemModel;

	public CustomerModel() {
		 /*
         * Default Constructor
         * 
         */

	}
	
	public int getCustId() {
		return custId;
	}
	@JsonIgnore
	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	@JsonIgnore
	public BusinessProblemModel getBusinessProblemModel() {
		return businessProblemModel;
	}
	
	public void setBusinessProblemModel(BusinessProblemModel businessProblemModel) {
		this.businessProblemModel = businessProblemModel;
	}

}

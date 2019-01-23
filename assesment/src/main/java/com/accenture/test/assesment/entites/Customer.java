package com.accenture.test.assesment.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "CUSTOMER")
public class Customer {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CUSTID")
    private Integer custId;
	
	@NotNull
    @Column(name = "CUSTOMERNAME", nullable = false, unique = true)
    private String customerName;
    
    @Column(name = "ACTIVE")
    private int active;
    
    @Column(name = "EMAILADDRESS")
    private String emailAddress;
    
    @Column(name = "MOBILENUMBER")
    private String mobileNumber;
    
    @Column(name = "PHONENUMBER")
    private String phoneNumber;
    
    @Column(name = "STATE")
    private String state;

	@Column(name = "COUNTRY")
    private String country;
    
    @Column(name = "LANGUAGE")
    private String language;
   
    @ManyToOne
    @JoinColumn(name = "PROBLEMID")
    @JsonIgnore
    private BusinessProblem businessProblem;

	public Customer() {
		 /*
         * Default Constructor
         * 
         */
		
    }

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
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

	public BusinessProblem getBusinessProblem() {
		return businessProblem;
	}

	public void setBusinessProblem(BusinessProblem businessProblem) {
		this.businessProblem = businessProblem;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", customerName=" + customerName + ", active=" + active
				+ ", emailAddress=" + emailAddress + ", mobileNumber=" + mobileNumber + ", phoneNumber=" + phoneNumber
				+ ", state=" + state + ", country=" + country + ", language=" + language + ", businessProblem="
				+ businessProblem + "]";
	}


}

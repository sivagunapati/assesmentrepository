package com.accenture.test.assesment.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class BusinessProblemModel {
	
	private int problemId;
	private String problemName;
	private String problemType;
	
	private List<CustomerModel> customerModeList = new ArrayList<>();
	
	public BusinessProblemModel() {
		
	}
	
	public BusinessProblemModel(int problemId, String problemName, String problemType) {
		super();
		this.problemId = problemId;
		this.problemName = problemName;
		this.problemType = problemType;
	}

	public int getProblemId() {
		return problemId;
	}
	
	@JsonIgnore
	public void setProblemId(int problemId) {
		this.problemId = problemId;
	}
	public String getProblemName() {
		return problemName;
	}
	public void setProblemName(String problemName) {
		this.problemName = problemName;
	}
	public String getProblemType() {
		return problemType;
	}
	public void setProblemType(String problemType) {
		this.problemType = problemType;
	}

	public List<CustomerModel> getCustomerModeList() {
		return customerModeList;
	}

	public void setCustomerModeList(List<CustomerModel> customerModeList) {
		this.customerModeList = customerModeList;
	}

	@Override
	public String toString() {
		return "BusinessProblem [problemId=" + problemId + ", problemName=" + problemName + ", problemType="
				+ problemType + "]";
	}
	
}

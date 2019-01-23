package com.accenture.test.assesment.model;

public class BusinessProblemDto {
	
	private int problemId;
	private String problemName;
	private String problemType;
	
	
	public BusinessProblemDto() {
		
	}
	
	public BusinessProblemDto(int problemId, String problemName, String problemType) {
		super();
		this.problemId = problemId;
		this.problemName = problemName;
		this.problemType = problemType;
	}

	public int getProblemId() {
		return problemId;
	}
	
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


	@Override
	public String toString() {
		return "BusinessProblem [problemId=" + problemId + ", problemName=" + problemName + ", problemType="
				+ problemType + "]";
	}
	
}

package com.accenture.test.assesment.entites;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "BUSINESS_PROBLEM")
public class BusinessProblem {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PROBLEMID")
    private int problemId;

    @Column(name = "PROBLEMNAME", nullable = false, unique = true)
    private String problemName;
    
    @Column(name = "PROBLEMTYPE")
    private String problemType;
    
    @OneToMany(mappedBy = "businessProblem", cascade = CascadeType.ALL)
    private List<Customer> customers;
   
    @ManyToMany(mappedBy = "businessProblems")
	private List<Features> features;
    
    public BusinessProblem() {
    }

	public BusinessProblem(int problemId, @NotNull String problemName, String problemType, List<Customer> customers,
			List<Features> features) {
		super();
		this.problemId = problemId;
		this.problemName = problemName;
		this.problemType = problemType;
		this.customers = customers;
		this.features = features;
	}



	public List<Features> getFeatures() {
		return features;
	}

	public void setFeatures(List<Features> features) {
		this.features = features;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
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
				+ problemType + ", customers=" + customers + ", features=" + features + "]";
	}
   

}

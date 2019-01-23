package com.accenture.test.assesment.service;

import java.util.List;

import com.accenture.test.assesment.entites.BusinessProblem;
import com.accenture.test.assesment.entites.Features;
import com.accenture.test.assesment.model.BusinessProblemModel;
import com.accenture.test.assesment.model.Feature;


public interface BusinessProblemService {
	
	public BusinessProblem getProblem(int problemId);
	public BusinessProblem createBusinessProblem(BusinessProblemModel businessProblem);
	//public List<Features> createFeature(Integer problemId, Feature feature);

}

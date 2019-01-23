package com.accenture.test.assesment.resource;


import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.test.assesment.entites.BusinessProblem;
import com.accenture.test.assesment.entites.Customer;
import com.accenture.test.assesment.entites.Features;
import com.accenture.test.assesment.model.BusinessProblemModel;
import com.accenture.test.assesment.model.Cloud;
import com.accenture.test.assesment.model.CustomerDto;
import com.accenture.test.assesment.model.Feature;
import com.accenture.test.assesment.service.BusinessProblemService;
import com.accenture.test.assesment.service.CustomerService;
import com.accenture.test.assesment.service.FeatureService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RequestMapping("/rest")
@RestController
@Api(value = "AssesmentResource", description = "Shows The Customer and Problem Details")
public class AssesmentResource {
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private BusinessProblemService businessProblemService;
	
	@Autowired
	private FeatureService featureService;
  
    
    @ApiOperation(value = "Get Customer Details BY Name")
    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping(value="secured/customername/{customerName}")
	public Customer getCustomer(@PathVariable("customerName") String customerName) {
		return customerService.getCustomer(customerName);
	}
    
    @ApiOperation(value = "Get Customer Details")
    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping(value="secured/customer/{customerId}")
   	public CustomerDto getCustomerById(@PathVariable("customerId") Integer customerId) {
   		return customerService.getCustomerById(customerId);
   	}
    
    @ApiOperation(value = "Get Problem Details")
    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping(value="secured/problem/{problemId}")
   	public BusinessProblem getProblem(@PathVariable("problemId") int problemId) {
   		return businessProblemService.getProblem(problemId);
   	}
    
    @ApiOperation(value = "Create A Proiblem")
    @PreAuthorize("hasAnyRole('ADMIN')")
    @PostMapping("secured/Problem/createProplem")
    public BusinessProblem createBusinessProblem(@Valid @RequestBody BusinessProblemModel businessProblem) {
    	return businessProblemService.createBusinessProblem(businessProblem);
    	
    }
    
    @ApiOperation(value = "Create A Customer")
    @PreAuthorize("hasAnyRole('ADMIN')")
    @PostMapping("secured/customer/createcusomer")
    public Customer createcustomer(@Valid @RequestBody CustomerDto customerDto) {
    	return customerService.createCustomer(customerDto);
    }
 /*   
    @ApiOperation(value = "Create A Feature")
    @PreAuthorize("hasAnyRole('ADMIN')")
    @PostMapping("secured/feature/{problemId}")
    public List<Features> createFeatures(@PathVariable (value = "problemId") Integer problemId, @Valid @RequestBody Feature feature) {
    	return businessProblemService.createFeature(problemId, feature);
    }
    */
    
    @ApiOperation(value = "Get Feature Details")
    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping(value="secured/clouds/{featureName}")
   	public List<Cloud> getfeatures(@PathVariable("featureName") String featureName) {
   		return featureService.getFeatures(featureName);
   	}
    

    
}

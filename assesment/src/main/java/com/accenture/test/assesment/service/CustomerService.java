package com.accenture.test.assesment.service;

import com.accenture.test.assesment.entites.Customer;
import com.accenture.test.assesment.model.CustomerDto;

public interface CustomerService {
	
	public Customer getCustomer(String custName);
	public CustomerDto getCustomerById(Integer custId);
	public Customer createCustomer(CustomerDto customer);

}

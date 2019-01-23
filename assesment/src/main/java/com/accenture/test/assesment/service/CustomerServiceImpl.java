package com.accenture.test.assesment.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.test.assesment.entites.BusinessProblem;
import com.accenture.test.assesment.entites.Customer;
import com.accenture.test.assesment.model.BusinessProblemDto;
import com.accenture.test.assesment.model.CustomerDto;
import com.accenture.test.assesment.repository.CustomerRepository;


@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
    private CustomerRepository customerRepository;

	@Override
	public Customer getCustomer(String customerName) {
		
	   List<Customer> customerList2 = customerRepository.findByCustomerName(customerName);
		return customerList2.get(0);
	}

	@Override
	public CustomerDto getCustomerById(Integer custId) {
		
		CustomerDto customerDto = new CustomerDto();
		List<Customer> customerList = customerRepository.findByCustId(custId);
		
		Customer customer = customerList.get(0);
		customerDto.setActive(customer.getActive());
		customerDto.setCountry(customer.getCountry());
		customerDto.setCustId(customer.getCustId());
		customerDto.setCustomerName(customer.getCustomerName());
		customerDto.setEmailAddress(customer.getEmailAddress());
		customerDto.setLanguage(customer.getLanguage());
		customerDto.setMobileNumber(customer.getMobileNumber());
		customerDto.setPhoneNumber(customer.getPhoneNumber());
		customerDto.setState(customer.getState());
		
		BusinessProblemDto businessProblemDto = new BusinessProblemDto();
		businessProblemDto.setProblemId(customer.getBusinessProblem().getProblemId());
		businessProblemDto.setProblemName(customer.getBusinessProblem().getProblemName());
		businessProblemDto.setProblemType(customer.getBusinessProblem().getProblemType());
		
		customerDto.setBusinessProblem(businessProblemDto);
		
		return customerDto;
		
	}

	@Override
	public Customer createCustomer(CustomerDto customerDto) {
		
		Customer customer = new Customer();
		customer.setCustId(customerDto.getCustId());
		customer.setCustomerName(customerDto.getCustomerName());
		customer.setActive(customerDto.getActive());
		customer.setCountry(customerDto.getCountry());
		customer.setEmailAddress(customerDto.getEmailAddress());
		customer.setLanguage(customerDto.getLanguage());
		customer.setMobileNumber(customerDto.getMobileNumber());
		customer.setPhoneNumber(customerDto.getPhoneNumber());
		customer.setState(customerDto.getState());
		
		BusinessProblem businessProblem = new BusinessProblem();
		businessProblem.setProblemId(customerDto.getBusinessProblem().getProblemId());
		   
		customer.setBusinessProblem(businessProblem);
		
		return customerRepository.save(customer);
	}

}

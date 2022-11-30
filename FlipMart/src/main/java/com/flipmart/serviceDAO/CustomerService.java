package com.flipmart.serviceDAO;

import java.util.List;

import com.flipmart.exception.CustomerException;
import com.flipmart.module.Customer;

public interface CustomerService {

	public List<Customer> getAllCustomers() throws CustomerException;
	
	public Customer getCustomerById(Integer custId) throws CustomerException;
	
	public Customer getCustomerByEmail(String email) throws CustomerException;
	
	public Customer addCustomer(Customer cust) throws CustomerException;
	
	public Customer deleteCustomer(Integer custId) throws CustomerException;
	
	public Customer updateCustomer(Customer cust) throws CustomerException;
}

package com.flipmart.logic;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.flipmart.exception.CustomerException;
import com.flipmart.module.Customer;
import com.flipmart.repository.CustomerRepo;
import com.flipmart.serviceDAO.CustomerService;

@Service
public class CustomerLogic implements CustomerService{

	@Autowired
	private CustomerRepo custRepo;
	
	@Override
	public List<Customer> getAllCustomers() throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomerById(Integer custId) throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer addCustomer(Customer cust) throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer deleteCustomer(Integer custId) throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer updateCustomer(Customer cust) throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomerByEmail(String email) throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

}

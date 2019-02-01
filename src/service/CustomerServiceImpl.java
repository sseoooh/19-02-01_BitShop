package service;

import java.util.List;

import domain.CustomerDTO;

public class CustomerServiceImpl implements CustomerService{
	
	private static CustomerServiceImpl instance = new CustomerServiceImpl();
	private CustomerServiceImpl() {dao = CustomerServiceImpl.getInstance();}
	public static CustomerServiceImpl getInstance() {return instance;}
	CustomerServiceImpl dao;

	@Override
	public void registCustomer(CustomerDTO emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CustomerDTO> bringCustomerList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerDTO> retrieveCustomerByName(String SearchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerDTO retrieveCustomer(String SearchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countCustomer() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existsCustomer(String searchWord) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void modifyCustomer(CustomerDTO emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCustomer(CustomerDTO emp) {
		// TODO Auto-generated method stub
		
	}

}

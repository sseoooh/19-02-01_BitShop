package dao;

import java.util.List;

import domain.CustomerDTO;

public class CustomerDAOImpl implements CustomerDAO{
	
	private static CustomerDAOImpl instance = new CustomerDAOImpl();
	private CustomerDAOImpl() {dao = CustomerDAOImpl.getInstance();}
	public static CustomerDAOImpl getInstance() {return instance;}
	CustomerDAOImpl dao;


	@Override
	public void insertCustomer(CustomerDTO emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CustomerDTO> selectCustomerList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerDTO> selectCustomerByName(String SearchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerDTO selectCustomer(String SearchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countCustomer() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public void updateCustomer(CustomerDTO emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCustomer(CustomerDTO emp) {
		// TODO Auto-generated method stub
		
	}

}

package dao;

import java.util.List;

import domain.CustomerDTO;

public interface CustomerDAO {
	public void insertCustomer(CustomerDTO emp);
	public List<CustomerDTO> selectCustomerList();
	public List<CustomerDTO> selectCustomerByName(String SearchWord);
	public CustomerDTO selectCustomer(String SearchWord);
	public int countCustomer();

	public void updateCustomer(CustomerDTO emp);
	public void deleteCustomer(CustomerDTO emp);
}

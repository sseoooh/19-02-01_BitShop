package service;

import java.util.List;

import domain.CustomerDTO;


public interface CustomerService {
	//C
	public void registCustomer(CustomerDTO emp);
	//R
	public List<CustomerDTO> bringCustomerList();
	public List<CustomerDTO> retrieveCustomerByName(String SearchWord);
	public CustomerDTO retrieveCustomer(String SearchWord);
	public int countCustomer();
	public boolean existsCustomer(String searchWord);
	//U
	public void modifyCustomer(CustomerDTO emp);
	//D
	public void removeCustomer(CustomerDTO emp);
}

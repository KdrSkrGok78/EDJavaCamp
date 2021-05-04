package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{

	public void save(Customer customer) throws Exception{
		System.out.println("Added to database : " + customer.getFirstName());
		
	}



}

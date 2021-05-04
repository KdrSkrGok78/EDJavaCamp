package interfaceAbstractDemo;

import java.util.GregorianCalendar;

import Abstract.BaseCustomerManager;
import Adaptors.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Customer kadir = new Customer(1,"Kadir Þükrü","Gök",new GregorianCalendar(2001, 07, 04).getTime(),"43349076398");

		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		baseCustomerManager.save(kadir);
		
		
	}

}

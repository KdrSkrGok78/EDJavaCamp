package interfaces;

public class CustomerManager {

	private ICustomerDal customerDal; // private ile dýþarýdan eriþimi engelledik

	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal ;
	}
	public void add() {
	// iþ kodlarý yazýlýr 	
		customerDal.add();
		
	}
}

package kadirBuradaMarket.business.concretes;



import kadirBuradaMarket.business.abstracts.ValidationService;
import kadirBuradaMarket.entities.concretes.User;

public class ValidationManager implements ValidationService {
	
	boolean validation = false;
	
	
	@Override
	public void emailValidation(User user) {
		
		System.out.println("Do�rulama e-postas� g�nderildi l�tfen mailinizi kontrol ediniz.");
		
		validation = true;
	}
	
	@Override
	public boolean userCheck(User user) {
		
		if(!((user.getEmail())==null) && !((user.getPassword())== null)) {
			//buraya veritaban�ndan sorgu at�p kullan�c� var m� yok mu bakacak kodlar yaz�lcak ben �imdilik true-false att�m	
			return true;
		}
		else {
			System.out.println("Kullan�c� bilgisi bulunamad�.");
			return false;
		}
		
		
	}

	

	

}

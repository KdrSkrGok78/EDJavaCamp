package kadirBuradaMarket.business.concretes;



import kadirBuradaMarket.business.abstracts.ValidationService;
import kadirBuradaMarket.entities.concretes.User;

public class ValidationManager implements ValidationService {
	
	boolean validation = false;
	
	
	@Override
	public void emailValidation(User user) {
		
		System.out.println("Doðrulama e-postasý gönderildi lütfen mailinizi kontrol ediniz.");
		
		validation = true;
	}
	
	@Override
	public boolean userCheck(User user) {
		
		if(!((user.getEmail())==null) && !((user.getPassword())== null)) {
			//buraya veritabanýndan sorgu atýp kullanýcý var mý yok mu bakacak kodlar yazýlcak ben þimdilik true-false attým	
			return true;
		}
		else {
			System.out.println("Kullanýcý bilgisi bulunamadý.");
			return false;
		}
		
		
	}

	

	

}

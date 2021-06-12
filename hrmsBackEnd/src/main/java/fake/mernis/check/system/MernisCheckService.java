package fake.mernis.check.system;

import kodlamaio.hrms.demo.entities.concretes.Candidate;

public class MernisCheckService {

	public void checkUserFromKPS(Candidate candidate) {
		boolean situation = true;
		
		if(situation== true) {
			System.out.println("Kimliğiniz doğrulandı sisteme giriş yapabilirsiniz.");
		}
		else {
			System.out.println("Kimlik doğrulama başarısız bilgilerinizi kontrol ediniz.");
		}
	}
}

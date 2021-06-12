package fake.email.check.service;


import kodlamaio.hrms.demo.entities.concretes.Employer;

public class DomainCheckService {

	public boolean checkDomainEmailVerification(Employer employer) {
		boolean result = true;
		
		if(result == true) {
			System.out.println("Doğrulama başarılı");
		}
		else {
			System.out.println("Doğrulamada bir şeyler ters gitti");
			
		}
		
		return result;
	}
}

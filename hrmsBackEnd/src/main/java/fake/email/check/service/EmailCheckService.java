package fake.email.check.service;

import kodlamaio.hrms.demo.entities.concretes.Candidate;

public class EmailCheckService {

	public boolean checkIfEmailVerification(Candidate candidate) {
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

package kodlamaio.hrms.demo.core.adapters;

import fake.email.check.service.EmailCheckService;
import kodlamaio.hrms.demo.business.abstracts.CandidateEmailCheckService;
import kodlamaio.hrms.demo.entities.concretes.Candidate;

public class EmailCheckAdapter implements CandidateEmailCheckService{

	@Override
	public boolean checkEmailVerification(Candidate candidate) {
		EmailCheckService emailCheck = new EmailCheckService();
		
		return emailCheck.checkIfEmailVerification(candidate);
	}

	

}

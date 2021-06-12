package kodlamaio.hrms.demo.core.adapters;

import fake.mernis.check.system.MernisCheckService;
import kodlamaio.hrms.demo.business.abstracts.CandidateCheckService;
import kodlamaio.hrms.demo.entities.concretes.Candidate;

public class MernisServiceAdapter implements CandidateCheckService{

	@Override
	public boolean checkIfRealUser(Candidate candidate) {

		boolean result = true;
		MernisCheckService mernisService = new MernisCheckService();
		
		mernisService.checkUserFromKPS(candidate);
		return result;
		
	}

}

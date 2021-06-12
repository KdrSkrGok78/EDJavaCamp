package kodlamaio.hrms.demo.core.adapters;

import fake.email.check.service.DomainCheckService;
import kodlamaio.hrms.demo.business.abstracts.EmployerDomainCheckService;
import kodlamaio.hrms.demo.entities.concretes.Employer;

public class DomainCheckAdapter implements EmployerDomainCheckService{

	@Override
	public boolean employerDomainCheck(Employer employer) {
		DomainCheckService domainCheckService = new DomainCheckService();
		
		return domainCheckService.checkDomainEmailVerification(employer);
	}

}

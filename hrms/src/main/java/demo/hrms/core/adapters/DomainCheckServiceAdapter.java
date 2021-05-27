package demo.hrms.core.adapters;

import demo.hrms.business.abstracts.EmployerCheckService;
import demo.hrms.entities.concrete.Employer;
import domain.check.service.PublicDomainCheck;

public class DomainCheckServiceAdapter implements EmployerCheckService{

	@Override
	public void checkRealEmployer(Employer employer) {
		PublicDomainCheck domainCheck = new PublicDomainCheck();
		
		domainCheck.checkDomain(employer.getWebAdress());
	}


	
}

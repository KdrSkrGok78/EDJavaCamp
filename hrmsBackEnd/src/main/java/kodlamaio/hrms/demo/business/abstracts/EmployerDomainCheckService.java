package kodlamaio.hrms.demo.business.abstracts;

import kodlamaio.hrms.demo.entities.concretes.Employer;

public interface EmployerDomainCheckService {

	boolean employerDomainCheck(Employer employer);
}

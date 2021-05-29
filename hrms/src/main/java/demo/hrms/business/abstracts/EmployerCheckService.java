package demo.hrms.business.abstracts;

import demo.hrms.entities.concrete.Employer;

public interface EmployerCheckService {

	void checkRealEmployer(Employer employer);
}

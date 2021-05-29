package demo.hrms.business.abstracts;

import java.util.List;

import demo.hrms.core.utilities.DataResult;
import demo.hrms.core.utilities.Result;
import demo.hrms.entities.concrete.Employer;

public interface EmployerService {

	DataResult<List<Employer>> getAll();
	Result add(Employer employer,EmployerCheckService employerCheck,String emailRepeat);
	
}

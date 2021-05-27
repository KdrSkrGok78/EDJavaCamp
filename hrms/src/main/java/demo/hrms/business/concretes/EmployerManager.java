package demo.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.hrms.business.abstracts.EmployerCheckService;
import demo.hrms.business.abstracts.EmployerService;
import demo.hrms.core.utilities.DataResult;
import demo.hrms.core.utilities.Result;
import demo.hrms.core.utilities.SuccessDataResult;
import demo.hrms.core.utilities.SuccessResult;
import demo.hrms.dataAccess.abstracts.EmployerDao;
import demo.hrms.entities.concrete.Employer;

@Service
public class EmployerManager implements EmployerService{

	private EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
		
		
	}
	
	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll());
	}

	
	@Override
	public Result add(Employer employer,EmployerCheckService employerCheck, String emailRepeat) {
		if(employer.getWebAdress().equals(emailRepeat)) {
			employerCheck.checkRealEmployer(employer);
			this.employerDao.save(employer);
		}
		
		return new SuccessResult("işveren olarak eklendi");
		
	}

}

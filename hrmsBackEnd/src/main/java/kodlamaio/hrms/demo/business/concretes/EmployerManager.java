package kodlamaio.hrms.demo.business.concretes;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.demo.business.abstracts.EmployerDomainCheckService;
import kodlamaio.hrms.demo.business.abstracts.EmployerService;
import kodlamaio.hrms.demo.core.utilities.DataResult;
import kodlamaio.hrms.demo.core.utilities.ErrorResult;
import kodlamaio.hrms.demo.core.utilities.Result;
import kodlamaio.hrms.demo.core.utilities.SuccessDataResult;
import kodlamaio.hrms.demo.core.utilities.SuccessResult;
import kodlamaio.hrms.demo.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.demo.entities.concretes.Employer;
import kodlamaio.hrms.demo.entities.concretes.JobAdvertisement;

@Service
public class EmployerManager implements EmployerService{

	private EmployerDao employerDao;
	private EmployerDomainCheckService employerDomainCheckService;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), "Datalar listelendi.");
	}

	@Override
	public Result add(Employer employer) {
		if(employerDomainCheckService.employerDomainCheck(employer) == true) {
			this.employerDao.save(employer);
		return new SuccessResult("İş veren eklendi.");
		}
		else {
			return new ErrorResult("İş veren eklenemedi");
		}
		
	}


}

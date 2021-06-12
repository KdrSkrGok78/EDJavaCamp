package kodlamaio.hrms.demo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.demo.business.abstracts.JobTitleService;
import kodlamaio.hrms.demo.core.utilities.DataResult;
import kodlamaio.hrms.demo.core.utilities.Result;
import kodlamaio.hrms.demo.core.utilities.SuccessDataResult;
import kodlamaio.hrms.demo.core.utilities.SuccessResult;
import kodlamaio.hrms.demo.dataAccess.abstracts.JobTitleDao;
import kodlamaio.hrms.demo.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService{

	private JobTitleDao jobTitleDao;
	
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}

	@Override
	public DataResult<List<JobTitle>> getAll() {
		return new SuccessDataResult<List<JobTitle>>
		(this.jobTitleDao.findAll(),"İş başlıkları listelendi");
	}

	@Override
	public Result add(JobTitle jobTitle) {
		this.jobTitleDao.save(jobTitle);
		return new SuccessResult("İş başlığı başarı ile eklendi");
	}

}

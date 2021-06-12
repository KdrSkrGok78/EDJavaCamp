package kodlamaio.hrms.demo.business.abstracts;

import java.util.List;

import kodlamaio.hrms.demo.core.utilities.DataResult;
import kodlamaio.hrms.demo.core.utilities.Result;
import kodlamaio.hrms.demo.entities.concretes.JobTitle;

public interface JobTitleService {

	DataResult<List<JobTitle>> getAll();
	Result add(JobTitle jobTitle);
}

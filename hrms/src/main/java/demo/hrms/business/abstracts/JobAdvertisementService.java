package demo.hrms.business.abstracts;

import java.util.List;

import demo.hrms.core.utilities.DataResult;
import demo.hrms.core.utilities.Result;
import demo.hrms.entities.concrete.JobAdvertisement;


public interface JobAdvertisementService {

	 Result add(JobAdvertisement jobAdvertisement);
	 DataResult<List<JobAdvertisement>> getAll();
     DataResult<List<JobAdvertisement>> getAllSorted();
	DataResult<List<JobAdvertisement>> getByCompanyNameContains(String companyName);
     
}

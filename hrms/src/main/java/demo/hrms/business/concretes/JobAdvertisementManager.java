package demo.hrms.business.concretes;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import demo.hrms.business.abstracts.JobAdvertisementService;
import demo.hrms.core.utilities.DataResult;
import demo.hrms.core.utilities.Result;
import demo.hrms.core.utilities.SuccessDataResult;
import demo.hrms.core.utilities.SuccessResult;
import demo.hrms.dataAccess.abstracts.JobAdvertisementDao;
import demo.hrms.entities.concrete.JobAdvertisement;


@Service
public class JobAdvertisementManager implements JobAdvertisementService{

	private JobAdvertisementDao jobAdvertisementDao;
	
	
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		return new SuccessDataResult<List<JobAdvertisement>>(
				this.jobAdvertisementDao.findAll(),"iş ilanları listelendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.DESC,"lastDate");
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.findAll(sort),"Başarılı");
	}

	
	@Override
	public DataResult<List<JobAdvertisement>> getByCompanyNameContains(String companyName) {
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.getByCompanyNameContains(companyName),"Data listelendi");
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("Ürün eklendi");
	}

}

package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CvService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CvDao;
import kodlamaio.hrms.entities.concretes.CV;


@Service
public class CvManager implements CvService{

	private CvDao cvDao;
	
	public CvManager(CvDao cvDao) {
		this.cvDao=cvDao;
	}
	
	@Override
	public DataResult<List<CV>> getAll() {
		return new SuccessDataResult<List<CV>>
		(this.cvDao.findAll(),"CV listelendi");	
	}

	@Override
	public Result add(CV cv) {
		this.cvDao.save(cv);
		return new SuccessResult("CV'niz sisteme başarıyla eklendi");
	}



}

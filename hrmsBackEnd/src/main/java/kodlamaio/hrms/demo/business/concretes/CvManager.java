package kodlamaio.hrms.demo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.demo.business.abstracts.CvService;
import kodlamaio.hrms.demo.core.utilities.DataResult;
import kodlamaio.hrms.demo.core.utilities.Result;
import kodlamaio.hrms.demo.core.utilities.SuccessDataResult;
import kodlamaio.hrms.demo.core.utilities.SuccessResult;
import kodlamaio.hrms.demo.dataAccess.abstracts.CvDao;
import kodlamaio.hrms.demo.entities.concretes.Candidate;
import kodlamaio.hrms.demo.entities.concretes.Cv;
@Service
public class CvManager implements CvService{

	private CvDao cvDao;
	@Autowired
	public CvManager(CvDao cvDao) {
		this.cvDao = cvDao;
	}
	@Override
	public DataResult<List<Cv>> getAll() {
		return new SuccessDataResult<List<Cv>>(this.cvDao.findAll());
	}

	@Override
	public Result add(Cv cv) {
		this.cvDao.save(cv);
		return new SuccessResult("Cv başarıyla eklendi");
	}
	@Override
	public DataResult<List<Cv>> getByCandidateContains(Candidate candidate) {
		return new SuccessDataResult<List<Cv>>(this.cvDao.getByCandidateContains(candidate));
		
	}

}

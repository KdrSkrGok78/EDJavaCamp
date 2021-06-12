package kodlamaio.hrms.demo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.demo.business.abstracts.CandidateCheckService;
import kodlamaio.hrms.demo.business.abstracts.CandidateEmailCheckService;
import kodlamaio.hrms.demo.business.abstracts.CandidateService;
import kodlamaio.hrms.demo.core.utilities.DataResult;
import kodlamaio.hrms.demo.core.utilities.ErrorResult;
import kodlamaio.hrms.demo.core.utilities.Result;
import kodlamaio.hrms.demo.core.utilities.SuccessDataResult;
import kodlamaio.hrms.demo.core.utilities.SuccessResult;
import kodlamaio.hrms.demo.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.demo.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService{

	private CandidateDao candidateDao;
	private CandidateCheckService candidateCheckService;
	private CandidateEmailCheckService candidateEmailCheckService;
	@Autowired
	public CandidateManager(CandidateDao candidateDao) {
		super();
		this.candidateDao = candidateDao;
	}

	@Override
	public DataResult<List<Candidate>> getAll() {
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll());
	}

	@Override
	public Result add(Candidate candidate) {
	
		if(candidateCheckService.checkIfRealUser(candidate)== true) {
			if(candidateEmailCheckService.checkEmailVerification(candidate)== true) {
				this.candidateDao.save(candidate);
				return new SuccessResult("Sisteme ekleme başarılı");
			}
			else {
				return new ErrorResult("Sisteme ekleme başarısız");
			}
		
		}
		else {
			return new ErrorResult("Sisteme ekleme başarısız");
		}
	}

	
}


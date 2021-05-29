package demo.hrms.business.concretes;

import java.rmi.RemoteException;
import java.util.List;

import javax.persistence.Column;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.hrms.business.abstracts.CandidateCheckService;
import demo.hrms.business.abstracts.CandidateService;
import demo.hrms.core.utilities.DataResult;
import demo.hrms.core.utilities.Result;
import demo.hrms.core.utilities.SuccessDataResult;
import demo.hrms.core.utilities.SuccessResult;
import demo.hrms.dataAccess.abstracts.CandidateDao;
import demo.hrms.entities.concrete.Candidate;
import demo.hrms.entities.concrete.User;

@Service
public class CandidateManager implements CandidateService{

	private CandidateDao candidateDao;
	
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
	public Result add(Candidate candidate,CandidateCheckService checkService,String emailRepeat) throws NumberFormatException, RemoteException {
		
		if(candidate.getEmail().equals(emailRepeat)) {
			checkService.checkIfRealPerson(candidate);
			return new SuccessResult("aday sisteme eklendi");
		}
		else {
			System.out.println("bilgilerinizi kontrol ediniz");
		}
		
		return null;
	}
	
}

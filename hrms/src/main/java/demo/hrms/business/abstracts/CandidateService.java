package demo.hrms.business.abstracts;

import java.rmi.RemoteException;
import java.util.List;

import demo.hrms.core.utilities.DataResult;
import demo.hrms.core.utilities.Result;
import demo.hrms.entities.concrete.Candidate;
import demo.hrms.entities.concrete.User;

public interface CandidateService {

	DataResult<List<Candidate>> getAll();
	Result add(Candidate candidate,CandidateCheckService checkService,String emailRepeat) throws NumberFormatException, RemoteException;
}



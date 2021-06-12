package kodlamaio.hrms.demo.business.abstracts;

import java.util.List;

import kodlamaio.hrms.demo.core.utilities.DataResult;
import kodlamaio.hrms.demo.core.utilities.Result;
import kodlamaio.hrms.demo.entities.concretes.Candidate;


public interface CandidateService {

	DataResult<List<Candidate>> getAll();
	Result add(Candidate candidate);
}

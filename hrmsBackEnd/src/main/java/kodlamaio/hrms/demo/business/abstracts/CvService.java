package kodlamaio.hrms.demo.business.abstracts;

import java.util.List;

import kodlamaio.hrms.demo.core.utilities.DataResult;
import kodlamaio.hrms.demo.core.utilities.Result;
import kodlamaio.hrms.demo.entities.concretes.Candidate;
import kodlamaio.hrms.demo.entities.concretes.Cv;

public interface CvService {

	DataResult<List<Cv>> getAll();
	Result add(Cv cv);
	DataResult<List<Cv>> getByCandidateContains(Candidate candidate);
}

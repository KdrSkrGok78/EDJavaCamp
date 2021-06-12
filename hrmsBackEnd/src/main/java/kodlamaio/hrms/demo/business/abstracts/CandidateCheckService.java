package kodlamaio.hrms.demo.business.abstracts;


import kodlamaio.hrms.demo.entities.concretes.Candidate;

public interface CandidateCheckService {

	boolean checkIfRealUser(Candidate candidate);
}

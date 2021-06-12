package kodlamaio.hrms.demo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.hrms.demo.entities.concretes.Candidate;

public interface CandidateDao extends JpaRepository<Candidate,Integer>{

}

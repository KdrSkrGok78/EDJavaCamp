package kodlamaio.hrms.demo.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.demo.entities.concretes.Candidate;
import kodlamaio.hrms.demo.entities.concretes.Cv;

public interface CvDao extends JpaRepository<Cv,Integer>{

	List<Cv> getByCandidateContains(Candidate candidate);
}

package demo.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.hrms.entities.concrete.Candidate;

public interface CandidateDao extends JpaRepository<Candidate,Integer>{

}

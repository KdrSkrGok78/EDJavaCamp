package demo.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.hrms.entities.concrete.JobTitle;


public interface JobTitleDao extends JpaRepository<JobTitle,Integer> {

}

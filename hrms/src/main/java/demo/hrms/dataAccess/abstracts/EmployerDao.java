package demo.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.hrms.entities.concrete.Employer;


public interface EmployerDao extends JpaRepository<Employer,Integer>{

}

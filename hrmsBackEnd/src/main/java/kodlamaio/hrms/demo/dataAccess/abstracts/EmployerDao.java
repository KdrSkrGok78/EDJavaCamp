package kodlamaio.hrms.demo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.hrms.demo.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer,Integer>{

}

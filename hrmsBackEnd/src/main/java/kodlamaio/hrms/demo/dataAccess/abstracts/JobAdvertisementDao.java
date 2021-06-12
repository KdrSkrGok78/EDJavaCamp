package kodlamaio.hrms.demo.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.demo.entities.concretes.Employer;
import kodlamaio.hrms.demo.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer>{

	List<JobAdvertisement> getByEmployerContains (Employer employer);
	
	List<JobAdvertisement> findByIsActiveIsTrue();
	
}

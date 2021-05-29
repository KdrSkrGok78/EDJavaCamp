package demo.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.hrms.entities.concrete.JobAdvertisement;


public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer>{

	List<JobAdvertisement> getByCompanyNameContains(String companyName);
	
	
	
	
	
	
	
	
	
}

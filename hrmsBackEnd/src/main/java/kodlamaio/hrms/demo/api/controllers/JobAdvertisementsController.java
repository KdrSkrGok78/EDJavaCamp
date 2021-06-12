package kodlamaio.hrms.demo.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.demo.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.demo.core.utilities.DataResult;
import kodlamaio.hrms.demo.entities.concretes.Employer;
import kodlamaio.hrms.demo.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/jobAdvertisement")
@CrossOrigin
public class JobAdvertisementsController {

	private JobAdvertisementService jobAdvertisementService;

	public JobAdvertisementsController(JobAdvertisementService jobAdvertisemenetService) {
		super();
		this.jobAdvertisementService = jobAdvertisemenetService;
	}
	

	@GetMapping("/getAll")
	public DataResult<List<JobAdvertisement>> getAll(){
		return this.jobAdvertisementService.getAll();
	}
	
	@GetMapping("/getEmployerContains")
	public DataResult<List<JobAdvertisement>> getByEmployerContains(@RequestParam Employer employer){
		return this.jobAdvertisementService.getByEmployerContains(employer);
	}
	
	@GetMapping("/getAllDateDesc")
	public DataResult<List<JobAdvertisement>> getAllSorted(){
		return this.jobAdvertisementService.getAllSorted();
	}
	
	@GetMapping("/getFindIsActive")
	public DataResult<List<JobAdvertisement>> findByIsActiveIsTrue(){
		return this.jobAdvertisementService.findByIsActiveIsTrue();
	}

}

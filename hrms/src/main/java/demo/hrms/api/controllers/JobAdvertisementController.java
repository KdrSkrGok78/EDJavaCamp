package demo.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import demo.hrms.business.abstracts.JobAdvertisementService;
import demo.hrms.core.utilities.DataResult;
import demo.hrms.core.utilities.Result;
import demo.hrms.entities.concrete.JobAdvertisement;


@RestController 
@RequestMapping("/api/job_advertisement_controller")
public class JobAdvertisementController {
	
	private JobAdvertisementService jobAdvertisementService;

	public JobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobAdvertisement>> getAll(){
		return this.jobAdvertisementService.getAll();
	}

	@GetMapping("/getByCompanyNameContains")
	public DataResult<List<JobAdvertisement>> getByCompanyNameContains(@RequestParam String companyName){
		return this.jobAdvertisementService.getByCompanyNameContains(companyName);
	}
	@GetMapping("/getAllDesc")
	public DataResult<List<JobAdvertisement>> getAllSorted() {
		return this.jobAdvertisementService.getAllSorted();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.add(jobAdvertisement);
	}
}

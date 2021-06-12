package kodlamaio.hrms.demo.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.demo.business.abstracts.CvService;
import kodlamaio.hrms.demo.core.utilities.DataResult;
import kodlamaio.hrms.demo.core.utilities.Result;
import kodlamaio.hrms.demo.entities.concretes.Candidate;
import kodlamaio.hrms.demo.entities.concretes.Cv;

@RestController
@RequestMapping("/api/cvs")
@CrossOrigin
public class CvsController {

	private CvService cvService;

	@Autowired
	public CvsController(CvService cvService) {
		super();
		this.cvService = cvService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Cv>> getAll(){
		return this.cvService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Cv cv) {
		return this.cvService.add(cv);
	}
	
	@GetMapping("/getCandidateContains")
	public DataResult<List<Cv>> getByCandidateContains(@RequestParam Candidate candidate){
		return this.cvService.getByCandidateContains(candidate);
	}
}

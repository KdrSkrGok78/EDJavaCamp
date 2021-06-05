package kodlamaio.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CvService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.CV;


@RestController
@RequestMapping("/api/cvs")
public class CVController {

	private CvService cvService;

	@Autowired
	public CVController(CvService cvService) {
		super();
		this.cvService = cvService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<CV>> getAll(){
		return this.cvService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody CV cv){
		this.cvService.add(cv);
	}
}

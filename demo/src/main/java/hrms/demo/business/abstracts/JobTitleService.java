package hrms.demo.business.abstracts;

import java.util.List;

import hrms.demo.entites.concretes.JobTitle;


public interface JobTitleService {

	List<JobTitle> getAll();
}

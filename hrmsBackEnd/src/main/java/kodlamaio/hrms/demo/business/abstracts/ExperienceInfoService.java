package kodlamaio.hrms.demo.business.abstracts;

import java.util.List;

import kodlamaio.hrms.demo.core.utilities.DataResult;
import kodlamaio.hrms.demo.core.utilities.Result;
import kodlamaio.hrms.demo.entities.concretes.ExperienceInfo;

public interface ExperienceInfoService {

	DataResult<List<ExperienceInfo>> getAll();
	Result add(ExperienceInfo experienceInfo);
}

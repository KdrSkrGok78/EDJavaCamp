package kodlamaio.hrms.demo.business.abstracts;

import java.util.List;

import kodlamaio.hrms.demo.core.utilities.DataResult;
import kodlamaio.hrms.demo.core.utilities.Result;
import kodlamaio.hrms.demo.entities.concretes.SchoolInfo;

public interface SchoolInfoService {

	DataResult<List<SchoolInfo>> getAll();
	Result add(SchoolInfo schoolInfo);
}

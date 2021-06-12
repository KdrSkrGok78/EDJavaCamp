package kodlamaio.hrms.demo.business.abstracts;

import java.util.List;

import kodlamaio.hrms.demo.core.utilities.DataResult;
import kodlamaio.hrms.demo.core.utilities.Result;
import kodlamaio.hrms.demo.entities.concretes.ForeignLanguage;

public interface ForeignLanguageService {

	DataResult<List<ForeignLanguage>> getAll();
	Result add(ForeignLanguage foreignLanguage);
}
